var {defineSupportCode} = require('cucumber');
var {expect} = require('chai');

function goToHome() {
  browser.url('/');
}

function navigateToLogin() {
  browser.waitForVisible('.login-button', 10000);
  browser.click('.login-button');
}

function fillLoginForm(email, password) {
  browser.waitForVisible('.gryphon', 10000);

  var mailInput = browser.element('#usernameInput');
  mailInput.setValue(email);

  var passwordInput = browser.element('#passwordInput');
  passwordInput.setValue(password);
}

function invokeLoginFunction() {
  browser.click('.btn.btn-info');
}

function verifyAlert() {
  if (browser.alertText()) {
    browser.alertDismiss();
  }
  var url = browser.getUrl();
  expect(url).to.equal('https://habitica.com/login');
}

function verifyImInLoginPage() {
  var url = browser.getUrl();
  expect(url).to.equal('https://habitica.com/login');
}

function verifyImLogged() {
  browser.waitForVisible('.member-stats', 50000);
  expect(browser.getText('.character-name')).to.be.an('array').that.includes('js.hernandez15');
}

function alreadyLoggedIn() {
  goToHome();
  navigateToLogin();
  fillLoginForm('js.hernandez15@uniandes.edu.co','ASDasd123');
  invokeLoginFunction();
  verifyImLogged();
}

var currentWord = "";

function registerHabit() {
  currentWord = Date.now();
  var habitInput = browser.element('.quick-add');
  habitInput.setValue(currentWord);
  browser.keys('Enter');
}

function checkHabitIsPresent() {
  browser.waitForVisible('p*=' + currentWord, 5000);
  expect(browser.getText('p*=' + currentWord)).to.have.string(currentWord);
}

defineSupportCode(({Given, When, Then}) => {
  Given('que voy a la página principal', goToHome);
  
  Given('que accedí a la página', alreadyLoggedIn);
  
  When('abro la página de acceso', navigateToLogin);
  
  When(/^diligencio mi (.*) y (.*)$/ , (email, password) => {
    fillLoginForm(email, password);
  });
  
  When('intento acceder', invokeLoginFunction);
  
  When('registro un hábito', registerHabit);

  Then('espero ver y cerrar una alerta', verifyAlert);

  Then('espero estar en la página de acceso', verifyImInLoginPage);

  Then('espero acceder a mi página personal', verifyImLogged);

  Then('lo veo en el panel inferior', checkHabitIsPresent);
});