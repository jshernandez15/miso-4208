~~~~
> habitica@3.111.6 test D:\4208\entrega1\habitica
> gulp test && npm run client:unit && gulp apidoc

[23:13:27] Using gulpfile D:\4208\entrega1\habitica\gulpfile.js
[23:13:27] Starting 'test'...
[23:13:27] Starting 'test:sanity'...

> habitica@3.111.6 test:sanity D:\4208\entrega1\habitica
> istanbul cover --dir coverage/sanity --report lcovonly node_modules/mocha/bin/_mocha -- test/sanity --recursive


 [0m [0m
 [0m  Locales files [0m
   [32m  √ [0m [90m do not contain duplicates of any keys [0m [33m (49ms) [0m

 [0m  Use Proper Babel Paths [0m
   [32m  √ [0m [90m uses proper babel files in website/server [0m [33m (68ms) [0m


 [92m  [0m [32m 2 passing [0m [90m (302ms) [0m

[23:13:33] Finished 'test:sanity' after 6.23 s
[23:13:33] Starting 'build'...
[23:13:33] Starting 'browserify'...
[23:13:33] Starting 'prepare:staticNewStuff'...
[23:13:34] Finished 'prepare:staticNewStuff' after 746 ms
[23:13:34] Starting 'test:prepare:translations'...
[23:13:34] Finished 'build' after 781 ms
[23:13:34] Finished 'test:prepare:translations' after 19 ms
[23:13:34] Starting 'test:prepare:build'...
[23:13:34] Finished 'test:prepare:build' after 2.05 μs
[23:13:34] Starting 'test:content'...

> habitica@3.111.6 test:content D:\4208\entrega1\habitica
> istanbul cover --dir coverage/content --report lcovonly node_modules/mocha/bin/_mocha -- test/content --recursive

[23:14:00] Finished 'browserify' after 27 s
[23:14:00] Starting 'build:dev'...
[23:14:00] Starting 'grunt-build:dev'...
 [4mRunning "cssmin:dist" (cssmin) task [24m
File website/client-old/css/habitrpg-shared.css created: 1.31 MB → 1.11 MB → 64.26 kB (gzip)

 [4mRunning "stylus:build" (stylus) task [24m
 [31m>>  [39mError: website/client-old/css/index.styl:6:9 [31m
>>  [39m    2| //@import "nib/vendor"
 [31m
>>  [39m    3| 
 [31m
>>  [39m    4| // Vendor Includes - include first so we can override
 [31m
>>  [39m    5| // Import only styles that do not have urls to images! Include them directly in the page!
 [31m
>>  [39m    6| @import "../bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css"
 [31m
>>  [39m--------------^ [31m
>>  [39m    7| @import "../bower_components/angular-loading-bar/build/loading-bar.css"
 [31m
>>  [39m    8| @import "../bower_components/select2/select2.css"
 [31m
>>  [39m    9| 
 [31m
>>  [39m [31m
>>  [39mfailed to locate @import file ../bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css
 [33mWarning: Stylus failed to compile.  [4mUsed --force, continuing. [24m [39m
 [31m>>  [39mError: website/client-old/css/static.styl:5:9 [31m
>>  [39m   1| @import "nib"
 [31m
>>  [39m   2| 
 [31m
>>  [39m   3| // Vendor Includes - include first so we can override
 [31m
>>  [39m   4| // Import only styles that do not have urls to images! Include them directly in the page!
 [31m
>>  [39m   5| @import "../bower_components/angular-loading-bar/build/loading-bar.css"
 [31m
>>  [39m--------------^ [31m
>>  [39m   6| @import "./shared.styl"
 [31m
>>  [39m   7| @import "./footer"
 [31m
>>  [39m   8| 
 [31m
>>  [39m [31m
>>  [39mfailed to locate @import file ../bower_components/angular-loading-bar/build/loading-bar.css
 [33mWarning: Stylus failed to compile.  [4mUsed --force, continuing. [24m [39m

 [31mDone, but with warnings. [39m
[23:14:10] Finished 'grunt-build:dev' after 9.64 s

 [0m [0m
 [0m  eggs [0m
 [0m    all [0m
     [32m  √ [0m [90m is a combination of drop and quest eggs [0m
     [32m  √ [0m [90m contains basic information about each egg [0m [31m (102ms) [0m

 [0m  FAQ Locales [0m
 [0m    Questions [0m
     [32m  √ [0m [90m has a valid questions [0m
     [32m  √ [0m [90m has a valid ios answers [0m
     [32m  √ [0m [90m has a valid web answers [0m
 [0m    Still Need Help Message [0m
     [32m  √ [0m [90m has a valid ios message [0m
     [32m  √ [0m [90m has a valid web message [0m

 [0m  Gear [0m
 [0m    weapon [0m
 [0m      base weapons [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      warrior weapons [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      rogue weapons [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      wizard weapons [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      healer weapons [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      special weapons [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m [33m (65ms) [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      mystery weapons [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      armoire weapons [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m    armor [0m
 [0m      base armors [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      warrior armors [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      rogue armors [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      wizard armors [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      healer armors [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      special armors [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m [33m (60ms) [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      mystery armors [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      armoire armors [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m    head [0m
 [0m      base heads [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      warrior heads [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      rogue heads [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      wizard heads [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      healer heads [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      special heads [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m [33m (59ms) [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      mystery heads [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      armoire heads [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m    shield [0m
 [0m      base shields [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      warrior shields [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      rogue shields [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      wizard shields [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      healer shields [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      special shields [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m [33m (43ms) [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      mystery shields [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      armoire shields [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m    back [0m
 [0m      base backs [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      mystery backs [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      special backs [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m    body [0m
 [0m      base bodys [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      mystery bodys [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      special bodys [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m    headAccessory [0m
 [0m      base headAccessorys [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      special headAccessorys [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      mystery headAccessorys [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      armoire headAccessorys [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m    eyewear [0m
 [0m      base eyewears [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      special eyewears [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      mystery eyewears [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m      armoire eyewears [0m
       [32m  √ [0m [90m have a value of at least 0 for each stat [0m
       [32m  √ [0m [90m have a purchase value of at least 0 [0m
       [32m  √ [0m [90m has a canBuy function [0m
       [32m  √ [0m [90m have valid translation strings for text and notes [0m
       [32m  √ [0m [90m has a set attribue [0m
 [0m    backer gear [0m
 [0m      armor_special_0 [0m
       [32m  √ [0m [90m canOwn returns true if user has a backer tier of 45 or higher [0m
       [32m  √ [0m [90m canOwn returns true if user already owns the item [0m
       [32m  √ [0m [90m canOwn returns true if user has previously owned the item [0m
       [32m  √ [0m [90m canOwn returns false if user does not have tier requirement and did not previously own the item [0m
 [0m      armor_special_2 [0m
       [32m  √ [0m [90m canOwn returns true if user has a backer tier of 300 or higher [0m
       [32m  √ [0m [90m canOwn returns true if user already owns the item [0m
       [32m  √ [0m [90m canOwn returns true if user has previously owned the item [0m
       [32m  √ [0m [90m canOwn returns false if user does not have tier requirement and did not previously own the item [0m
 [0m      head_special_0 [0m
       [32m  √ [0m [90m canOwn returns true if user has a backer tier of 45 or higher [0m
       [32m  √ [0m [90m canOwn returns true if user already owns the item [0m
       [32m  √ [0m [90m canOwn returns true if user has previously owned the item [0m
       [32m  √ [0m [90m canOwn returns false if user does not have tier requirement and did not previously own the item [0m
 [0m      head_special_2 [0m
       [32m  √ [0m [90m canOwn returns true if user has a backer tier of 300 or higher [0m
       [32m  √ [0m [90m canOwn returns true if user already owns the item [0m
       [32m  √ [0m [90m canOwn returns true if user has previously owned the item [0m
       [32m  √ [0m [90m canOwn returns false if user does not have tier requirement and did not previously own the item [0m
 [0m      weapon_special_0 [0m
       [32m  √ [0m [90m canOwn returns true if user has a backer tier of 70 or higher [0m
       [32m  √ [0m [90m canOwn returns true if user already owns the item [0m
       [32m  √ [0m [90m canOwn returns true if user has previously owned the item [0m
       [32m  √ [0m [90m canOwn returns false if user does not have tier requirement and did not previously own the item [0m
 [0m      weapon_special_2 [0m
       [32m  √ [0m [90m canOwn returns true if user has a backer tier of 300 or higher [0m
       [32m  √ [0m [90m canOwn returns true if user already owns the item [0m
       [32m  √ [0m [90m canOwn returns true if user has previously owned the item [0m
       [32m  √ [0m [90m canOwn returns false if user does not have tier requirement and did not previously own the item [0m
 [0m      weapon_special_3 [0m
       [32m  √ [0m [90m canOwn returns true if user has a backer tier of 300 or higher [0m
       [32m  √ [0m [90m canOwn returns true if user already owns the item [0m
       [32m  √ [0m [90m canOwn returns true if user has previously owned the item [0m
       [32m  √ [0m [90m canOwn returns false if user does not have tier requirement and did not previously own the item [0m
 [0m    contributor gear [0m
 [0m      armor_special_1 [0m
       [32m  √ [0m [90m canOwn returns true if user has a contributor tier of 2 or higher [0m
       [32m  √ [0m [90m canOwn returns true if user already owns the item [0m
       [32m  √ [0m [90m canOwn returns true if user has previously owned the item [0m
       [32m  √ [0m [90m canOwn returns false if user does not have tier requirement and did not previously own the item [0m
 [0m      head_special_1 [0m
       [32m  √ [0m [90m canOwn returns true if user has a contributor tier of 3 or higher [0m
       [32m  √ [0m [90m canOwn returns true if user already owns the item [0m
       [32m  √ [0m [90m canOwn returns true if user has previously owned the item [0m
       [32m  √ [0m [90m canOwn returns false if user does not have tier requirement and did not previously own the item [0m
 [0m      shield_special_1 [0m
       [32m  √ [0m [90m canOwn returns true if user has a contributor tier of 5 or higher [0m
       [32m  √ [0m [90m canOwn returns true if user already owns the item [0m
       [32m  √ [0m [90m canOwn returns true if user has previously owned the item [0m
       [32m  √ [0m [90m canOwn returns false if user does not have tier requirement and did not previously own the item [0m
 [0m      weapon_special_1 [0m
       [32m  √ [0m [90m canOwn returns true if user has a contributor tier of 4 or higher [0m
       [32m  √ [0m [90m canOwn returns true if user already owns the item [0m
       [32m  √ [0m [90m canOwn returns true if user has previously owned the item [0m
       [32m  √ [0m [90m canOwn returns false if user does not have tier requirement and did not previously own the item [0m
 [0m      hammer of bug smashing [0m
       [32m  √ [0m [90m canOwn returns true if user has a critical flag on their contributor object [0m
       [32m  √ [0m [90m canOwn returns true if user already owns the item [0m
       [32m  √ [0m [90m canOwn returns true if user has previously owned the item [0m
       [32m  √ [0m [90m canOwn returns false if user does not have tier requirement and did not previously own the item [0m

 [0m  hatchingPotions [0m
 [0m    all [0m
     [32m  √ [0m [90m is a combination of drop and premium potions [0m
     [32m  √ [0m [90m contains basic information about each potion [0m

 [0m  Mystery Sets [0m
   [32m  √ [0m [90m has a valid text string [0m

 [0m  stable [0m
 [0m    dropPets [0m
     [32m  √ [0m [90m contains a pet for each drop potion * each drop egg [0m
 [0m    questPets [0m
     [32m  √ [0m [90m contains a pet for each drop potion * each quest egg [0m
 [0m    premiumPets [0m
     [32m  √ [0m [90m contains a pet for each premium potion * each drop egg [0m
 [0m    specialPets [0m
     [32m  √ [0m [90m each value is a valid translation string [0m
 [0m    dropMounts [0m
     [32m  √ [0m [90m contains a mount for each drop potion * each drop egg [0m
 [0m    questMounts [0m
     [32m  √ [0m [90m contains a mount for each drop potion * each quest egg [0m
 [0m    premiumMounts [0m
     [32m  √ [0m [90m contains a mount for each premium potion * each drop egg [0m
 [0m    specialMounts [0m
     [32m  √ [0m [90m each value is a valid translation string [0m
 [0m    petInfo [0m
     [32m  √ [0m [90m contains an entry for all pets [0m
     [32m  √ [0m [90m contains basic information about each pet [0m [31m (273ms) [0m
 [0m    mountInfo [0m
     [32m  √ [0m [90m contains an entry for all mounts [0m
     [32m  √ [0m [90m contains basic information about each mount [0m [31m (266ms) [0m

 [0m  time-travelers store [0m
   [32m  √ [0m [90m removes owned sets from the time travelers store [0m
   [32m  √ [0m [90m removes unopened mystery item sets from the time travelers store [0m

 [0m  Translator [0m
   [32m  √ [0m [90m returns error message if string is not properly formatted [0m
   [32m  √ [0m [90m returns an error message if string does not exist [0m


 [92m  [0m [32m 304 passing [0m [90m (2s) [0m


=============================== Coverage summary ===============================
Statements   : 28.98% ( 1764/6088 )
Branches     : 3.3% ( 124/3755 )
Functions    : 15.33% ( 149/972 )
Lines        : 31.38% ( 1752/5584 )
================================================================================
[23:14:22] Finished 'test:content' after 48 s
[23:14:22] Starting 'build'...
[23:14:22] Starting 'browserify'...
[23:14:22] Starting 'prepare:staticNewStuff'...
[23:14:23] Finished 'prepare:staticNewStuff' after 630 ms
[23:14:23] Starting 'test:prepare:translations'...
[23:14:23] Finished 'build' after 653 ms
[23:14:23] Finished 'test:prepare:translations' after 10 ms
[23:14:23] Starting 'test:prepare:build'...
[23:14:23] Finished 'test:prepare:build' after 11 μs
[23:14:23] Starting 'test:common'...

> habitica@3.111.6 test:common D:\4208\entrega1\habitica
> istanbul cover --dir coverage/common --report lcovonly node_modules/mocha/bin/_mocha -- test/common --recursive

[23:14:48] Finished 'browserify' after 25 s

 [0m [0m
 [0m  count [0m
 [0m    beastMasterProgress [0m
     [32m  √ [0m [90m returns 0 if no pets [0m
     [32m  √ [0m [90m counts drop pets [0m
     [32m  √ [0m [90m does not count quest pets [0m
     [32m  √ [0m [90m does not count pets hatched with premium potions [0m
     [32m  √ [0m [90m does not count special pets [0m
     [32m  √ [0m [90m counts drop pets that have been raised to a mount [0m
     [32m  √ [0m [90m does not counts drop pets that have been released [0m
 [0m    mountMasterProgress [0m
     [32m  √ [0m [90m returns 0 if no mounts [0m
     [32m  √ [0m [90m counts drop mounts [0m
     [32m  √ [0m [90m does not count premium mounts [0m
     [32m  √ [0m [90m does not count quest mounts [0m
     [32m  √ [0m [90m does not count special mounts [0m
     [32m  √ [0m [90m only counts drop mounts that are currently owned [0m
 [0m    remainingGearInSet [0m
     [32m  √ [0m [90m counts remaining gear based on set [0m
     [36m  - includes previously owned items in count (https: //github.com/HabitRPG/habitrpg/issues/5624#issuecomment-124018717) [0m
 [0m    dropPetsCurrentlyOwned [0m
     [32m  √ [0m [90m counts drop pets owned [0m
     [32m  √ [0m [90m does not count pets that have been raised to mounts [0m
     [32m  √ [0m [90m does not count quest pets [0m
     [32m  √ [0m [90m does not count special pets [0m
 [0m    questsOfCategory [0m
     [32m  √ [0m [90m counts user quest scrolls of a particular category [0m

 [0m  shared.fns.autoAllocate [0m
 [0m    flat allocation mode [0m
     [32m  √ [0m [90m increases the lowest stat [0m
 [0m    task based allocation mode [0m
     [32m  √ [0m [90m increases highest training stat [0m
     [32m  √ [0m [90m increases strength if no stat can be suggested [0m
     [32m  √ [0m [90m resets training object [0m
 [0m    class based allocation mode [0m
     [32m  √ [0m [90m increases stats based on class preference [0m
 [0m    invalid alocation mode [0m
     [32m  √ [0m [90m increases strenth [0m

 [0m  crit [0m
   [32m  √ [0m [90m computes [0m

 [0m  shared.fns.handleTwoHanded [0m
   [32m  √ [0m [90m uses "messageTwoHandedUnequip" message if item is a shield and current weapon is two handed (and sets the user's weapon to the base one) [0m
   [32m  √ [0m [90m uses "messageTwoHandedEquip" message if item is two handed and currentShield exists but is not "shield_base_0" (and sets the user's shield to the base one) [0m

 [0m  shared.fns.predictableRandom [0m
   [32m  √ [0m [90m returns a number [0m
   [32m  √ [0m [90m returns the same value when user.stats is the same and no seed is passed [0m
   [32m  √ [0m [90m returns a different value when user.stats is not the same and no seed is passed [0m
   [32m  √ [0m [90m returns the same value when the same seed is passed [0m
   [32m  √ [0m [90m returns a different value when a different seed is passed [0m

 [0m  common.fns.randomDrop [0m
   [32m  √ [0m [90m drops an item for the user.party.quest.progress [0m
 [0m    drops enabled [0m
     [32m  √ [0m [90m does nothing if user.items.lastDrop.count is exceeded [0m
     [32m  √ [0m [90m drops something when the task is a todo [0m
     [32m  √ [0m [90m drops something when the task is a habit [0m
     [32m  √ [0m [90m drops something when the task is a daily [0m
     [32m  √ [0m [90m drops something when the task is a reward [0m
     [32m  √ [0m [90m drops food [0m
     [32m  √ [0m [90m drops eggs [0m
 [0m      drops hatching potion [0m
       [32m  √ [0m [90m drops a very rare potion [0m
       [32m  √ [0m [90m drops a rare potion [0m
       [32m  √ [0m [90m drops an uncommon potion [0m
       [32m  √ [0m [90m drops a common potion [0m

 [0m  common.fns.statsComputed [0m
   [32m  √ [0m [90m returns the same result if called directly, through user.fns.statsComputed, or user._statsComputed [0m
   [32m  √ [0m [90m returns default values [0m
   [32m  √ [0m [90m calculates stat bonuses for equipment [0m
   [32m  √ [0m [90m calculates stat bonuses for class [0m
   [32m  √ [0m [90m calculates stat bonuses for level [0m
   [32m  √ [0m [90m correctly caps level stat bonuses [0m
   [32m  √ [0m [90m sets baseStat field [0m
   [32m  √ [0m [90m sets buffs field [0m
   [32m  √ [0m [90m calculates mp from intelligence [0m
   [32m  √ [0m [90m calculates stat bonuses for back equipment [0m

 [0m  shared.fns.ultimateGear [0m
   [32m  √ [0m [90m sets armoirEnabled when partial achievement already achieved [0m
   [32m  √ [0m [90m does not set armoireEnabled when gear is not owned [0m

 [0m  common.fns.updateStats [0m
 [0m    No Hp [0m
     [32m  √ [0m [90m updates users hp [0m
     [32m  √ [0m [90m does not lower hp below 0 [0m
 [0m    Stat Allocation [0m
     [32m  √ [0m [90m adds only attribute points up to user's level [0m
     [32m  √ [0m [90m adds an attibute point when user's stat points are less than max level [0m
     [32m  √ [0m [90m does not add an attibute point when user's stat points are equal to max level [0m
     [32m  √ [0m [90m does not add an attibute point when user's stat points + unallocated points are equal to max level [0m
     [32m  √ [0m [90m only awards stat points up to level 100 if user is missing unallocated stat points and is over level 100 [0m
     [32m  √ [0m [90m add user notification when drops are enabled [0m
     [32m  √ [0m [90m add user notification when rebirth is enabled [0m
     [36m  - auto allocates stats if automaticAllocation is turned on [0m
 [0m      assigns flags.levelDrops [0m
       [32m  √ [0m [90m for atom1 [0m
       [32m  √ [0m [90m for vice1 [0m
       [32m  √ [0m [90m moonstone [0m
       [32m  √ [0m [90m for goldenknight1 [0m

 [0m  achievements [0m
 [0m    general well-formedness [0m
     [32m  √ [0m [90m each category has 'label' and 'achievements' fields [0m
     [32m  √ [0m [90m each achievement has all required fields of correct types [0m
     [32m  √ [0m [90m categories have unique labels [0m
     [32m  √ [0m [90m achievements have unique keys [0m
     [32m  √ [0m [90m achievements have unique indices [0m
     [32m  √ [0m [90m all categories have at least 1 achievement [0m
 [0m    unearned basic achievements [0m
     [32m  √ [0m [90m streak and perfect day achievements exist with counts [0m
     [32m  √ [0m [90m party up/on achievements exist with no counts [0m
     [32m  √ [0m [90m pet/mount master and triad bingo achievements exist with counts [0m
     [32m  √ [0m [90m ultimate gear achievements exist with no counts [0m
     [32m  √ [0m [90m card achievements exist with counts [0m
     [32m  √ [0m [90m rebirth achievement exists with no count [0m
 [0m    unearned seasonal achievements [0m
     [32m  √ [0m [90m habiticaDays and habitBirthdays achievements exist with counts [0m
     [32m  √ [0m [90m spell achievements exist with counts [0m
     [32m  √ [0m [90m quest achievements do not exist [0m
     [32m  √ [0m [90m costumeContests achievement exists with count [0m
     [32m  √ [0m [90m card achievements exist with counts [0m
 [0m    unearned special achievements [0m
     [32m  √ [0m [90m habitSurveys achievement exists with count [0m
     [32m  √ [0m [90m contributor achievement exists with value and no count [0m
     [32m  √ [0m [90m npc achievement is hidden if unachieved [0m
     [32m  √ [0m [90m kickstarter achievement is hidden if unachieved [0m
     [32m  √ [0m [90m veteran achievement is hidden if unachieved [0m
     [32m  √ [0m [90m originalUser achievement is hidden if unachieved [0m
 [0m    earned seasonal achievements [0m
     [32m  √ [0m [90m quest achievements exist [0m
 [0m    earned special achievements [0m
     [32m  √ [0m [90m habitSurveys achievement is earned with correct value [0m
     [32m  √ [0m [90m contributor achievement is earned with correct value [0m
     [32m  √ [0m [90m npc achievement is earned with correct value [0m
     [32m  √ [0m [90m kickstarter achievement is earned with correct value [0m
     [32m  √ [0m [90m veteran achievement is earned [0m
     [32m  √ [0m [90m originalUser achievement is earned [0m
 [0m    mountMaster, beastMaster, and triadBingo achievements [0m
     [32m  √ [0m [90m master and triad bingo achievements do not include *Text2 strings if no keys have been used [0m
     [32m  √ [0m [90m master and triad bingo achievements includes *Text2 strings if keys have been used [0m
 [0m    ultimateGear achievements [0m
     [32m  √ [0m [90m title and text contain localized class info [0m

 [0m  appliedTags [0m
   [32m  √ [0m [90m returns the tasks [0m

 [0m  gold [0m
   [32m  √ [0m [90m is 0 [0m
   [32m  √ [0m [90m is 5 in 5.2 of gold [0m

 [0m  noTags [0m
   [32m  √ [0m [90m returns true for no tags [0m
   [32m  √ [0m [90m returns false for some tags [0m

 [0m  percent [0m
   [32m  √ [0m [90m with direction "up" [0m
   [32m  √ [0m [90m with direction "down" [0m
   [32m  √ [0m [90m with no direction [0m

 [0m  pickDeep [0m
   [32m  √ [0m [90m throws an error if "properties" is not an array [0m
   [32m  √ [0m [90m returns an object of properties taken from the input object [0m

 [0m  randomVal [0m
   [32m  √ [0m [90m returns a random value from an object [0m
   [32m  √ [0m [90m can pass in a predictable random value [0m
   [32m  √ [0m [90m returns a random key when the key option is passed in [0m

 [0m  refPush [0m
   [32m  √ [0m [90m it hashes one object into another by its id [0m
   [32m  √ [0m [90m it hashes one object into another by a uuid when object does not have an id [0m
   [32m  √ [0m [90m it hashes one object into another by a id and gives it the highest sort value [0m

 [0m  shops [0m
 [0m    market [0m
     [32m  √ [0m [90m contains at least the 3 default categories [0m
     [32m  √ [0m [90m does not contain an empty category [0m
     [32m  √ [0m [90m does not duplicate identifiers [0m
     [32m  √ [0m [90m items contain required fields [0m
 [0m    questShop [0m
     [32m  √ [0m [90m does not contain an empty category [0m
     [32m  √ [0m [90m does not duplicate identifiers [0m
     [32m  √ [0m [90m items contain required fields [0m
 [0m    timeTravelers [0m
     [32m  √ [0m [90m does not contain an empty category [0m
     [32m  √ [0m [90m does not duplicate identifiers [0m
     [32m  √ [0m [90m items contain required fields [0m
 [0m    seasonalShop [0m
     [32m  √ [0m [90m does not contain an empty category [0m
     [32m  √ [0m [90m does not duplicate identifiers [0m
     [32m  √ [0m [90m items contain required fields [0m

 [0m  silver [0m
   [32m  √ [0m [90m is 0 [0m
   [32m  √ [0m [90m 20 coins in 5.2 of gold: two decimal places [0m
   [32m  √ [0m [90m 4 coint in 5.04 of gold: one decimal place [0m
   [32m  √ [0m [90m is no value [0m

 [0m  splitWhitespace [0m
   [32m  √ [0m [90m returns an array [0m

 [0m  taskClasses [0m
 [0m    a todo task [0m
     [32m  √ [0m [90m is hidden [0m
     [32m  √ [0m [90m is beingEdited [0m
     [32m  √ [0m [90m is completed [0m
 [0m    a daily task [0m
     [32m  √ [0m [90m is completed [0m
     [36m  - is uncompleted [0m
 [0m    a habit [0m
     [32m  √ [0m [90m that is wide [0m
     [32m  √ [0m [90m that is narrow [0m
 [0m    varies based on priority [0m
     [32m  √ [0m [90m trivial [0m
     [32m  √ [0m [90m hard [0m
 [0m    varies based on value [0m
     [32m  √ [0m [90m color-worst [0m
     [32m  √ [0m [90m color-neutral [0m

 [0m  taskDefaults [0m
   [32m  √ [0m [90m applies defaults to undefined type or habit [0m
   [32m  √ [0m [90m applies defaults to a daily [0m
   [32m  √ [0m [90m applies defaults a reward [0m
   [32m  √ [0m [90m applies defaults a todo [0m

 [0m  updateStore [0m
 [0m    returns a list of gear items available for purchase [0m
     [32m  √ [0m [90m contains the first item not purchased for each gear type [0m
     [32m  √ [0m [90m contains mystery items the user can own [0m
     [32m  √ [0m [90m contains special items the user can own [0m
     [32m  √ [0m [90m contains armoire items the user can own [0m

 [0m  shared.ops.addTask [0m
   [32m  √ [0m [90m adds an habit [0m
   [32m  √ [0m [90m adds an habtit when type is invalid [0m
   [32m  √ [0m [90m adds a daily [0m
   [32m  √ [0m [90m adds a todo [0m
   [32m  √ [0m [90m adds a reward [0m
 [0m    user preferences [0m
     [32m  √ [0m [90m respects newTaskEdit preference [0m
     [32m  √ [0m [90m respects tagsCollapsed preference [0m
     [32m  √ [0m [90m respects advancedCollapsed preference [0m

 [0m  shared.ops.allocate [0m
   [32m  √ [0m [90m throws an error if an invalid attribute is supplied [0m
   [32m  √ [0m [90m throws an error if the user doesn't have attribute points [0m
   [32m  √ [0m [90m defaults to the "str" attribute [0m
   [32m  √ [0m [90m allocates attribute points [0m
   [32m  √ [0m [90m increases mana when allocating to "int" [0m

 [0m  shared.ops.allocateNow [0m
   [32m  √ [0m [90m auto allocates all points [0m

 [0m  shared.ops.blockUser [0m
   [32m  √ [0m [90m validates uuid [0m
   [32m  √ [0m [90m blocks user [0m
   [32m  √ [0m [90m blocks, then unblocks user [0m

 [0m  shared.ops.buy [0m
   [32m  √ [0m [90m returns error when key is not provided [0m
   [32m  √ [0m [90m recovers 15 hp [0m
   [32m  √ [0m [90m adds equipment to inventory [0m [33m (43ms) [0m

 [0m  shared.ops.buyArmoire [0m
 [0m    failure conditions [0m
     [32m  √ [0m [90m does not open if user does not have enough gold [0m
 [0m    non-gear awards [0m
     [32m  √ [0m [90m gives Experience [0m
     [32m  √ [0m [90m gives food [0m
     [32m  √ [0m [90m does not give equipment if all equipment has been found [0m
 [0m    gear awards [0m
     [32m  √ [0m [90m always drops equipment the first time [0m
     [32m  √ [0m [90m gives more equipment [0m

 [0m  shared.ops.buyGear [0m
 [0m    Gear [0m
     [32m  √ [0m [90m adds equipment to inventory [0m
     [32m  √ [0m [90m deducts gold from user [0m
     [32m  √ [0m [90m auto equips equipment if user has auto-equip preference turned on [0m
     [32m  √ [0m [90m buyGears equipment but does not auto-equip [0m
     [32m  √ [0m [90m does not buyGear equipment twice [0m
     [36m  - removes one-handed weapon and shield if auto-equip is on and a two-hander is bought [0m
     [36m  - buyGears two-handed equipment but does not automatically remove sword or shield [0m
     [32m  √ [0m [90m does not buyGear equipment without enough Gold [0m

 [0m  shared.ops.buyHealthPotion [0m
 [0m    Potion [0m
     [32m  √ [0m [90m recovers 15 hp [0m
     [32m  √ [0m [90m does not increase hp above 50 [0m
     [32m  √ [0m [90m deducts 25 gp [0m
     [32m  √ [0m [90m does not purchase if not enough gp [0m
     [32m  √ [0m [90m does not purchase if hp is full [0m
     [32m  √ [0m [90m does not allow potion purchases when hp is zero [0m
     [32m  √ [0m [90m does not allow potion purchases when hp is negative [0m

 [0m  shared.ops.buyMysterySet [0m
 [0m    Mystery Sets [0m
 [0m      failure conditions [0m
       [32m  √ [0m [90m does not grant mystery sets without Mystic Hourglasses [0m
       [32m  √ [0m [90m does not grant mystery set that has already been purchased [0m
 [0m      successful purchases [0m
       [32m  √ [0m [90m buys Steampunk Accessories Set [0m

 [0m  shared.ops.buyQuest [0m
   [32m  √ [0m [90m buys a Quest scroll [0m
   [32m  √ [0m [90m does not buy Quests without enough Gold [0m
   [32m  √ [0m [90m does not buy nonexistent Quests [0m
   [32m  √ [0m [90m does not buy Gem-premium Quests [0m

 [0m  shared.ops.buySpecialSpell [0m
   [32m  √ [0m [90m throws an error if params.key is missing [0m
   [32m  √ [0m [90m throws an error if the spell doesn't exists [0m
   [32m  √ [0m [90m throws an error if the user doesn't have enough gold [0m
   [32m  √ [0m [90m buys an item [0m

 [0m  shared.ops.changeClass [0m
   [32m  √ [0m [90m user is not level 10 [0m
   [32m  √ [0m [90m req.query.class is an invalid class [0m
 [0m    req.query.class is a valid class [0m
     [32m  √ [0m [90m errors if user.stats.flagSelected is true and user.balance < 0.75 [0m
     [32m  √ [0m [90m changes class [0m [33m (38ms) [0m
 [0m    req.query.class is missing or user.stats.flagSelected is true [0m
     [32m  √ [0m [90m has user.preferences.disableClasses === true [0m [33m (41ms) [0m
 [0m      has user.preferences.disableClasses !== true [0m
       [32m  √ [0m [90m and less than 3 gems [0m
       [32m  √ [0m [90m and at least 3 gems [0m [33m (38ms) [0m

 [0m  shared.ops.clearPMs [0m
   [32m  √ [0m [90m clears messages [0m

 [0m  shared.ops.deletePM [0m
   [32m  √ [0m [90m delete message [0m

 [0m  shared.ops.disableClasses [0m
   [32m  √ [0m [90m disable classes [0m

 [0m  shared.ops.equip [0m
 [0m    Gear [0m
     [32m  √ [0m [90m should not send a message if a weapon is equipped while only having zero or one weapons equipped [0m
     [32m  √ [0m [90m should send messages if equipping a two-hander causes the off-hander to be unequipped [0m
     [32m  √ [0m [90m should send messages if equipping an off-hand item causes a two-handed weapon to be unequipped [0m

 [0m  shared.ops.feed [0m
 [0m    failure conditions [0m
     [32m  √ [0m [90m does not allow feeding without specifying pet and food [0m
     [32m  √ [0m [90m does not allow feeding if pet name format is invalid [0m
     [32m  √ [0m [90m does not allow feeding if food does not exist [0m
     [32m  √ [0m [90m does not allow feeding if pet is not owned [0m
     [32m  √ [0m [90m does not allow feeding if food is not owned [0m
     [32m  √ [0m [90m does not allow feeding of special pets [0m
     [32m  √ [0m [90m does not allow feeding of mounts [0m
 [0m    successful feeding [0m
     [32m  √ [0m [90m evolves the pet if the food is a Saddle [0m
     [32m  √ [0m [90m enjoys the food [0m
     [32m  √ [0m [90m enjoys the food (premium potion) [0m
     [32m  √ [0m [90m does not like the food [0m
     [32m  √ [0m [90m evolves the pet into a mount when feeding user.items.pets[pet] >= 50 [0m

 [0m  shared.ops.hatch [0m
 [0m    Pet Hatching [0m
 [0m      failure conditions [0m
       [32m  √ [0m [90m does not allow hatching without specifying egg and potion [0m
       [32m  √ [0m [90m does not allow hatching if user lacks specified egg [0m
       [32m  √ [0m [90m does not allow hatching if user lacks specified hatching potion [0m
       [32m  √ [0m [90m does not allow hatching if user already owns target pet [0m
       [32m  √ [0m [90m does not allow hatching quest pet egg using premium potion [0m
 [0m      successful hatching [0m
       [32m  √ [0m [90m hatches a basic pet [0m
       [32m  √ [0m [90m hatches a quest pet [0m
       [32m  √ [0m [90m hatches a premium pet [0m
       [32m  √ [0m [90m hatches a pet previously raised to a mount [0m

 [0m  user.ops.hourglassPurchase [0m
 [0m    failure conditions [0m
     [32m  √ [0m [90m return error when key is not provided [0m
     [32m  √ [0m [90m returns error when type is not provided [0m
     [32m  √ [0m [90m returns error when inccorect type is provided [0m
     [32m  √ [0m [90m does not grant to pets without Mystic Hourglasses [0m
     [32m  √ [0m [90m does not grant to mounts without Mystic Hourglasses [0m
     [32m  √ [0m [90m does not grant pet that is not part of the Time Travel Stable [0m
     [32m  √ [0m [90m does not grant mount that is not part of the Time Travel Stable [0m
     [32m  √ [0m [90m does not grant pet that has already been purchased [0m
     [32m  √ [0m [90m does not grant mount that has already been purchased [0m
 [0m    successful purchases [0m
     [32m  √ [0m [90m buys a pet [0m
     [32m  √ [0m [90m buys a mount [0m

 [0m  shared.ops.openMysteryItem [0m
   [32m  √ [0m [90m returns error when item key is empty [0m
   [32m  √ [0m [90m opens mystery item [0m

 [0m  shared.ops.purchase [0m
 [0m    failure conditions [0m
     [32m  √ [0m [90m returns an error when type is not provided [0m
     [32m  √ [0m [90m returns an error when key is not provided [0m
     [32m  √ [0m [90m prevents unsubscribed user from buying gems [0m
     [32m  √ [0m [90m prevents user with not enough gold from buying gems [0m
     [32m  √ [0m [90m prevents user that have reached the conversion cap from buying gems [0m
     [32m  √ [0m [90m returns error when unknown type is provided [0m
     [32m  √ [0m [90m returns error when user attempts to purchase a piece of gear they own [0m
     [32m  √ [0m [90m returns error when unknown item is requested [0m
     [32m  √ [0m [90m returns error when user does not have permission to buy an item [0m
     [32m  √ [0m [90m returns error when user does not have enough gems to buy an item [0m
 [0m    successful purchase [0m
     [32m  √ [0m [90m purchases gems [0m
     [32m  √ [0m [90m purchases gems with a different language than the default [0m
     [32m  √ [0m [90m purchases eggs [0m
     [32m  √ [0m [90m purchases hatchingPotions [0m
     [32m  √ [0m [90m purchases food [0m
     [32m  √ [0m [90m purchases quests [0m
     [32m  √ [0m [90m purchases gear [0m
     [32m  √ [0m [90m purchases quest bundles [0m

 [0m  shared.ops.readCard [0m
   [32m  √ [0m [90m returns an error when cardType is not provided [0m
   [32m  √ [0m [90m returns an error when unknown cardType is provided [0m
   [32m  √ [0m [90m reads a card [0m

 [0m  shared.ops.rebirth [0m
   [32m  √ [0m [90m returns an error when user balance is too low and user is less than max level [0m
   [32m  √ [0m [90m rebirths a user with enough gems [0m
   [32m  √ [0m [90m rebirths a user with not enough gems but max level [0m
   [32m  √ [0m [90m rebirths a user with not enough gems but more than max level [0m
   [32m  √ [0m [90m resets user's tasks values except for rewards to 0 [0m
   [32m  √ [0m [90m resets user's daily streaks to 0 [0m
   [32m  √ [0m [90m resets a user's buffs [0m
   [32m  √ [0m [90m resets a user's health points [0m
   [32m  √ [0m [90m resets a user's class [0m
   [32m  √ [0m [90m resets a user's stats [0m
   [32m  √ [0m [90m retains a user's gear [0m
   [32m  √ [0m [90m retains a user's gear owned [0m
   [32m  √ [0m [90m resets a user's current pet [0m
   [32m  √ [0m [90m resets a user's current mount [0m
   [32m  √ [0m [90m resets a user's flags [0m [33m (42ms) [0m
   [32m  √ [0m [90m does not reset rebirthEnabled if user has beastMaster [0m
   [32m  √ [0m [90m sets rebirth achievement [0m
   [32m  √ [0m [90m increments rebirth achievements [0m
   [32m  √ [0m [90m does not increment rebirth achievements when level is lower than previous [0m
   [32m  √ [0m [90m always increments rebirth achievements when level is MAX_LEVEL [0m
   [32m  √ [0m [90m always increments rebirth achievements when level is greater than MAX_LEVEL [0m
   [32m  √ [0m [90m keeps automaticAllocation false [0m
   [32m  √ [0m [90m sets automaticAllocation to false when true [0m

 [0m  shared.ops.releaseBoth [0m
   [32m  √ [0m [90m returns an error when user balance is too low and user does not have triadBingo [0m
   [32m  √ [0m [90m grants triad bingo with gems [0m
   [32m  √ [0m [90m grants triad bingo without gems [0m
   [32m  √ [0m [90m does not grant triad bingo if any pet has not been previously found [0m
   [32m  √ [0m [90m releases pets [0m
   [32m  √ [0m [90m does not increment beastMasterCount if any pet is level 0 (released) [0m
   [32m  √ [0m [90m does not increment beastMasterCount if any pet is missing (null) [0m
   [32m  √ [0m [90m does not increment beastMasterCount if any pet is missing (undefined) [0m
   [32m  √ [0m [90m releases mounts [0m
   [32m  √ [0m [90m does not increase mountMasterCount achievement if mount is missing (null) [0m
   [32m  √ [0m [90m does not increase mountMasterCount achievement if mount is missing (undefined) [0m
   [32m  √ [0m [90m removes drop currentPet [0m
   [32m  √ [0m [90m removes drop currentMount [0m
   [32m  √ [0m [90m leaves non-drop pets and mounts equipped [0m
   [32m  √ [0m [90m decreases user's balance [0m
   [32m  √ [0m [90m incremenets beastMasterCount [0m
   [32m  √ [0m [90m incremenets mountMasterCount [0m

 [0m  shared.ops.releaseMounts [0m
   [32m  √ [0m [90m returns an error when user balance is too low [0m
   [32m  √ [0m [90m releases mounts [0m
   [32m  √ [0m [90m removes drop currentMount [0m
   [32m  √ [0m [90m leaves non-drop mount equipped [0m
   [32m  √ [0m [90m increases mountMasterCount achievement [0m
   [32m  √ [0m [90m does not increase mountMasterCount achievement if mount is missing (null) [0m
   [32m  √ [0m [90m does not increase mountMasterCount achievement if mount is missing (undefined) [0m
   [32m  √ [0m [90m subtracts gems from balance [0m

 [0m  shared.ops.releasePets [0m
   [32m  √ [0m [90m returns an error when user balance is too low [0m
   [32m  √ [0m [90m releases pets [0m
   [32m  √ [0m [90m removes drop currentPet [0m
   [32m  √ [0m [90m leaves non-drop pets equipped [0m
   [32m  √ [0m [90m decreases user's balance [0m
   [32m  √ [0m [90m incremenets beastMasterCount [0m
   [32m  √ [0m [90m does not increment beastMasterCount if any pet is level 0 (released) [0m
   [32m  √ [0m [90m does not increment beastMasterCount if any pet is missing (null) [0m
   [32m  √ [0m [90m does not increment beastMasterCount if any pet is missing (undefined) [0m

 [0m  shared.ops.reroll [0m
   [32m  √ [0m [90m returns an error when user balance is too low [0m
   [32m  √ [0m [90m rerolls a user with enough gems [0m
   [32m  √ [0m [90m reduces a user's balance [0m
   [32m  √ [0m [90m resets a user's health points [0m
   [32m  √ [0m [90m resets user's taks values except for rewards to 0 [0m

 [0m  shared.ops.reset [0m
   [32m  √ [0m [90m resets a user [0m
   [32m  √ [0m [90m resets user's health [0m
   [32m  √ [0m [90m resets user's level [0m
   [32m  √ [0m [90m resets user's gold [0m
   [32m  √ [0m [90m resets user's exp [0m
   [32m  √ [0m [90m resets user's tasksOrder [0m
   [32m  √ [0m [90m keeps automaticAllocation false [0m
   [32m  √ [0m [90m sets automaticAllocation to false when true [0m

 [0m  shared.ops.revive [0m
   [32m  √ [0m [90m returns an error when user is not dead [0m
   [32m  √ [0m [90m resets user's hp, exp and gp [0m
   [32m  √ [0m [90m decreases user's level [0m
   [32m  √ [0m [90m decreases a stat [0m
   [32m  √ [0m [90m it decreases a random stat from str, con, per, int by one [0m
   [32m  √ [0m [90m removes a random item from user gear owned [0m
   [32m  √ [0m [90m does not remove 0 value items [0m
   [32m  √ [0m [90m allows removing warrior sword (0 value item) [0m
   [32m  √ [0m [90m does not remove items of a different class [0m
   [32m  √ [0m [90m removes "special" items [0m
   [32m  √ [0m [90m removes "armoire" items [0m
   [32m  √ [0m [90m dequips lost item from user if user had it equipped [0m
   [32m  √ [0m [90m dequips lost item from user costume if user was using it in costume [0m

 [0m  shared.ops.scoreTask [0m
   [32m  √ [0m [90m throws an error when scoring a reward if user does not have enough gold [0m
   [32m  √ [0m [90m checks that the streak parameters affects the score [0m
   [32m  √ [0m [90m completes when the task direction is up [0m
   [32m  √ [0m [90m uncompletes when the task direction is down [0m
 [0m    verifies that times parameter in scoring works [0m
     [32m  √ [0m [90m works [0m
 [0m    scores [0m
     [32m  √ [0m [90m critical hits [0m
     [32m  √ [0m [90m and increments quest progress [0m
     [32m  √ [0m [90m does not modify stats when task need approval [0m
 [0m      habits [0m
       [32m  √ [0m [90m up [0m
       [32m  √ [0m [90m adds score notes [0m
       [32m  √ [0m [90m down [0m
 [0m      dailys [0m
       [32m  √ [0m [90m up [0m
       [32m  √ [0m [90m up, down [0m
       [32m  √ [0m [90m sets completed = false on direction = down [0m
 [0m      todos [0m
       [32m  √ [0m [90m up [0m
       [32m  √ [0m [90m up, down [0m

 [0m  shared.ops.sell [0m
   [32m  √ [0m [90m returns an error when type is not provided [0m
   [32m  √ [0m [90m returns an error when key is not provided [0m
   [32m  √ [0m [90m returns an error when non-sellable type is provided [0m
   [32m  √ [0m [90m returns an error when key is not found with type provided [0m
   [32m  √ [0m [90m returns an error when the requested amount is above the available amount [0m
   [32m  √ [0m [90m reduces item count from user [0m
   [32m  √ [0m [90m increases user's gold [0m

 [0m  shared.ops.sleep [0m
   [32m  √ [0m [90m toggles user.preferences.sleep [0m

 [0m  shared.ops.unlock [0m
   [32m  √ [0m [90m returns an error when path is not provided [0m
   [32m  √ [0m [90m returns an error when user balance is too low [0m
   [32m  √ [0m [90m returns an error when user already owns a full set [0m
   [36m  - returns an error when user already owns items in a full set [0m
   [32m  √ [0m [90m equips an item already owned [0m
   [32m  √ [0m [90m un-equips an item already equipped [0m
   [32m  √ [0m [90m unlocks a full set [0m
   [32m  √ [0m [90m unlocks a full set of gear [0m
   [32m  √ [0m [90m unlocks a an item [0m
   [32m  √ [0m [90m reduces a user's balance [0m

 [0m  shared.ops.updateTask [0m
   [32m  √ [0m [90m updates a task [0m

 [0m  shouldDo [0m
   [32m  √ [0m [90m returns false if task type is not a daily [0m
   [32m  √ [0m [90m returns false if startDate is in the future [0m
 [0m    Timezone variations [0m
 [0m      User timezone is UTC [0m
       [32m  √ [0m [90m returns true if Start Date is before today [0m
       [32m  √ [0m [90m returns true if Start Date is today [0m
       [32m  √ [0m [90m returns false if Start Date is after today [0m
 [0m      User timezone is between UTC-12 and UTC (0~720) [0m
       [32m  √ [0m [90m returns true if Start Date is before today [0m
       [32m  √ [0m [90m returns true if Start Date is today [0m
       [32m  √ [0m [90m returns true if the user's current time is after start date and Custom Day Start [0m
       [32m  √ [0m [90m returns false if the user's current time is before Custom Day Start [0m
 [0m      User timezone is between UTC and GMT+14 (-840~0) [0m
       [32m  √ [0m [90m returns true if Start Date is before today [0m
       [32m  √ [0m [90m returns true if Start Date is today [0m
       [32m  √ [0m [90m returns true if the user's current time is after Custom Day Start [0m
       [32m  √ [0m [90m returns false if the user's current time is before Custom Day Start [0m
 [0m    Custom Day Start variations [0m
 [0m      Custom Day Start is midnight (Default dayStart=0) [0m
 [0m        Current Date is yesterday [0m
         [32m  √ [0m [90m should not be due yesterday [0m
 [0m        Current Date is today [0m
         [32m  √ [0m [90m returns false if current time is before midnight [0m
         [32m  √ [0m [90m returns true if current time is after midnight [0m
 [0m        Current Date is tomorrow [0m
         [32m  √ [0m [90m should not be due tomorrow [0m
 [0m      Custom Day Start is 0 <= n < 24 [0m
 [0m        Current Date is yesterday [0m
         [32m  √ [0m [90m should not be due yesterday [0m
 [0m        Current Date is today [0m
         [32m  √ [0m [90m returns false if current hour is before Custom Day Start [0m
         [32m  √ [0m [90m returns true if current hour is after Custom Day Start [0m
 [0m        Current Date is tomorrow [0m
         [32m  √ [0m [90m returns true if current hour is before Custom Day Start [0m
         [32m  √ [0m [90m returns false if current hour is after Custom Day Start [0m
 [0m    Every X Days [0m
     [32m  √ [0m [90m returns false if daily does not have an everyX property [0m
     [32m  √ [0m [90m returns false in between X Day intervals [0m
     [32m  √ [0m [90m returns true on multiples of x [0m
     [32m  √ [0m [90m should compute daily nextDue values [0m
 [0m      On multiples of x [0m
       [32m  √ [0m [90m returns true when Custom Day Start is midnight [0m
       [32m  √ [0m [90m returns true when current time is after Custom Day Start [0m
       [32m  √ [0m [90m returns false when current time is before Custom Day Start [0m
 [0m      If number of X days is zero [0m
       [32m  √ [0m [90m returns false on the Start Date [0m
       [32m  √ [0m [90m returns false on the day before Start Date [0m
       [32m  √ [0m [90m returns false on the day after Start Date [0m
 [0m    Certain Days of the Week [0m
     [32m  √ [0m [90m returns false if task does not have a repeat property [0m
     [32m  √ [0m [90m returns false if day of the week does not match [0m
     [32m  √ [0m [90m returns false and ignore malformed repeat object [0m
     [32m  √ [0m [90m returns false if day of the week does not match and active on the day it matches [0m
     [32m  √ [0m [90m returns true if Daily on matching days of the week [0m
     [32m  √ [0m [90m should compute weekly nextDue values [0m
     [32m  √ [0m [90m should not go into an infinite loop with invalid values [0m
 [0m      Day of the week matches [0m
 [0m        Custom Day Start is midnight (Default dayStart=0) [0m
 [0m          Current Date is one day before the matching day [0m
           [32m  √ [0m [90m should return false [0m
 [0m          Current Date is on the matching day [0m
           [32m  √ [0m [90m returns false if current time is before midnight [0m
           [32m  √ [0m [90m returns true if current time is after midnight [0m
 [0m          Current Date is one day after the matching day [0m
           [32m  √ [0m [90m should not be due tomorrow [0m
 [0m        Custom Day Start is 0 <= n < 24 [0m
 [0m          Current Date is one day before the matching day [0m
           [32m  √ [0m [90m should not be due [0m
 [0m          Current Date is on the matching day [0m
           [32m  √ [0m [90m returns false if current hour is before Custom Day Start [0m
           [32m  √ [0m [90m returns true if current hour is after Custom Day Start [0m
 [0m          Current Date is one day after the matching day [0m
           [32m  √ [0m [90m returns true if current hour is before Custom Day Start [0m
           [32m  √ [0m [90m returns false if current hour is after Custom Day Start [0m
 [0m      No days of the week is selected [0m
       [32m  √ [0m [90m returns false for a day before the Start Date [0m
       [32m  √ [0m [90m returns false for the Start Date [0m
       [32m  √ [0m [90m returns false for a day after the Start Date [0m
       [32m  √ [0m [90m returns false for today [0m
 [0m    Every X Weeks [0m
     [32m  √ [0m [90m leaves daily inactive if it has not been the specified number of weeks [0m
     [32m  √ [0m [90m leaves daily inactive if on every (x) week on weekday it is incorrect weekday [0m
     [32m  √ [0m [90m activates Daily on matching week [0m
     [32m  √ [0m [90m activates Daily on every (x) week on weekday [0m
     [32m  √ [0m [90m activates Daily on start date [0m
 [0m      Custom Day Start is 0 <= n < 24 [0m
 [0m        Current Date is one day before the matching day [0m
         [32m  √ [0m [90m should not be due [0m
 [0m        Current Date is on the matching day [0m
         [32m  √ [0m [90m returns false if current hour is before Custom Day Start [0m
         [32m  √ [0m [90m returns true if current hour is after Custom Day Start [0m
 [0m        Current Date is one day after the matching day [0m
         [32m  √ [0m [90m returns true if current hour is before Custom Day Start [0m
         [32m  √ [0m [90m returns false if current hour is after Custom Day Start [0m
 [0m    Monthly - Every X Months on a specified date [0m
     [32m  √ [0m [90m leaves daily inactive if not day of the month [0m
     [32m  √ [0m [90m activates Daily on matching day of month [0m
     [32m  √ [0m [90m leaves daily inactive if not on date of the x month [0m
     [32m  √ [0m [90m activates Daily if on date of the x month [0m
     [32m  √ [0m [90m activates Daily on start date [0m
     [32m  √ [0m [90m should compute monthly nextDue values [0m
 [0m      Custom Day Start is 0 <= n < 24 [0m
 [0m        Current Date is one day before the matching day [0m
         [32m  √ [0m [90m should not be due [0m
 [0m        Current Date is on the matching day [0m
         [32m  √ [0m [90m returns false if current hour is before Custom Day Start [0m
         [32m  √ [0m [90m returns true if current hour is after Custom Day Start [0m
 [0m        Current Date is one day after the matching day [0m
         [32m  √ [0m [90m returns true if current hour is before Custom Day Start [0m
         [32m  √ [0m [90m returns false if current hour is after Custom Day Start [0m
 [0m    Monthly - Certain days of the nth Week [0m
     [32m  √ [0m [90m leaves daily inactive if not the correct week of the month on the day of the start date [0m
     [32m  √ [0m [90m returns false when next due is requested and no repeats are available [0m
     [32m  √ [0m [90m activates Daily if correct week of the month on the day of the start date [0m
     [32m  √ [0m [90m leaves daily inactive if not day of the month with every x month on weekday [0m
     [32m  √ [0m [90m activates Daily if on nth weekday of the x month [0m
     [32m  √ [0m [90m activates Daily on start date [0m
 [0m      Custom Day Start is 0 <= n < 24 [0m
 [0m        Current Date is one day before the matching day [0m
         [32m  √ [0m [90m should not be due [0m
 [0m        Current Date is on the matching day [0m
         [32m  √ [0m [90m returns false if current hour is before Custom Day Start [0m
         [32m  √ [0m [90m returns true if current hour is after Custom Day Start [0m
 [0m        Current Date is one day after the matching day [0m
         [32m  √ [0m [90m returns true if current hour is before Custom Day Start [0m
         [32m  √ [0m [90m returns false if current hour is after Custom Day Start [0m
 [0m    Every X Years [0m
     [32m  √ [0m [90m leaves daily inactive if not the correct year [0m
     [32m  √ [0m [90m activates Daily on matching year [0m
     [32m  √ [0m [90m activates Daily on start date [0m
     [32m  √ [0m [90m should compute yearly nextDue values [0m
 [0m      Custom Day Start is 0 <= n < 24 [0m
 [0m        Current Date is one day before the matching day [0m
         [32m  √ [0m [90m should not be due [0m
 [0m        Current Date is on the matching day [0m
         [32m  √ [0m [90m returns false if current hour is before Custom Day Start [0m
         [32m  √ [0m [90m returns true if current hour is after Custom Day Start [0m
 [0m        Current Date is one day after the matching day [0m
         [32m  √ [0m [90m returns true if current hour is before Custom Day Start [0m
         [32m  √ [0m [90m returns false if current hour is after Custom Day Start [0m

 [0m  helper functions used in stat calculations [0m
 [0m    maxHealth [0m
     [32m  √ [0m [90m provides a maximum Health value [0m
 [0m    maxLevel [0m
     [32m  √ [0m [90m returns a maximum level for attribute gain [0m
 [0m    capByLevel [0m
     [32m  √ [0m [90m returns level given if below cap [0m
     [32m  √ [0m [90m returns level given if equal to cap [0m
     [32m  √ [0m [90m returns level cap if above cap [0m
 [0m    toNextLevel [0m
     [32m  √ [0m [90m increases Experience target from one level to the next [0m
 [0m    diminishingReturns [0m
     [32m  √ [0m [90m provides a value under the maximum, given a bonus and maximum [0m
     [32m  √ [0m [90m provides a value under the maximum, given a bonus, maximum, and halfway point [0m
     [32m  √ [0m [90m provides a different curve if a halfway point is defined [0m


 [92m  [0m [32m 492 passing [0m [90m (5s) [0m
 [36m  [0m [36m 6 pending [0m


=============================== Coverage summary ===============================
Statements   : 54.86% ( 3340/6088 )
Branches     : 35.79% ( 1344/3755 )
Functions    : 35.8% ( 348/972 )
Lines        : 57.4% ( 3205/5584 )
================================================================================
[23:15:14] Finished 'test:common' after 51 s
[23:15:14] Starting 'build'...
[23:15:14] Starting 'browserify'...
[23:15:14] Starting 'prepare:staticNewStuff'...
[23:15:15] Finished 'prepare:staticNewStuff' after 810 ms
[23:15:15] Starting 'test:prepare:translations'...
[23:15:15] Finished 'build' after 828 ms
[23:15:15] Finished 'test:prepare:translations' after 12 ms
[23:15:15] Starting 'test:prepare:build'...
[23:15:15] Finished 'test:prepare:build' after 2.39 μs
[23:15:15] Starting 'test:karma'...

> habitica@3.111.6 test:karma D:\4208\entrega1\habitica
> karma start test/client-old/spec/karma.conf.js --single-run

DEPRECATED: use your own version of lodash, this will go away in karma@2.0
DEPRECATED: use your own version of lodash, this will go away in karma@2.0

 [4m [1mSTART: [22m [24m
 [33m03 09 2017 23:15:22.627:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/jquery/dist/jquery.js" does not match any file.
 [33m03 09 2017 23:15:22.630:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/pnotify/jquery.pnotify.js" does not match any file.
 [33m03 09 2017 23:15:22.631:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/angular/angular.js" does not match any file.
 [33m03 09 2017 23:15:22.631:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/angular-loading-bar/build/loading-bar.min.js" does not match any file.
 [33m03 09 2017 23:15:22.632:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/angular-resource/angular-resource.min.js" does not match any file.
 [33m03 09 2017 23:15:22.632:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/hello/dist/hello.all.min.js" does not match any file.
 [33m03 09 2017 23:15:22.633:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/angular-sanitize/angular-sanitize.js" does not match any file.
 [33m03 09 2017 23:15:22.633:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/bootstrap/dist/js/bootstrap.js" does not match any file.
 [33m03 09 2017 23:15:22.633:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/angular-bootstrap/ui-bootstrap.js" does not match any file.
 [33m03 09 2017 23:15:22.634:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/angular-bootstrap/ui-bootstrap-tpls.js" does not match any file.
 [33m03 09 2017 23:15:22.634:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/angular-ui-router/release/angular-ui-router.js" does not match any file.
 [33m03 09 2017 23:15:22.635:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/angular-filter/dist/angular-filter.js" does not match any file.
 [33m03 09 2017 23:15:22.635:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/angular-ui/build/angular-ui.js" does not match any file.
 [33m03 09 2017 23:15:22.635:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/angular-ui-utils/ui-utils.min.js" does not match any file.
 [33m03 09 2017 23:15:22.636:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/Angular-At-Directive/src/at.js" does not match any file.
 [33m03 09 2017 23:15:22.636:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/Angular-At-Directive/src/caret.js" does not match any file.
 [33m03 09 2017 23:15:22.637:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/angular-mocks/angular-mocks.js" does not match any file.
 [33m03 09 2017 23:15:22.637:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/ngInfiniteScroll/build/ng-infinite-scroll.js" does not match any file.
 [33m03 09 2017 23:15:22.637:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/select2/select2.js" does not match any file.
 [33m03 09 2017 23:15:22.638:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/angular-ui-select2/src/select2.js" does not match any file.
 [33m03 09 2017 23:15:22.639:WARN [watcher]:  [39mPattern "D:/4208/entrega1/habitica/website/client-old/bower_components/habitica-markdown/dist/habitica-markdown.min.js" does not match any file.
 [32m03 09 2017 23:15:29.680:INFO [karma]:  [39mKarma v1.7.1 server started at http://0.0.0.0:8080/
 [32m03 09 2017 23:15:29.681:INFO [launcher]:  [39mLaunching browser PhantomJS with unlimited concurrency
 [32m03 09 2017 23:15:29.701:INFO [launcher]:  [39mStarting browser PhantomJS
 [32m03 09 2017 23:15:33.102:INFO [PhantomJS 2.1.1 (Windows 8 0.0.0)]:  [39mConnected on socket BEGiwyTbsXYoBb0vAAAA with id 60645520
[23:15:40] Finished 'browserify' after 26 s
 [33m03 09 2017 23:15:43.103:WARN [PhantomJS 2.1.1 (Windows 8 0.0.0)]:  [39mDisconnected (1 times), because no message in 10000 ms.
PhantomJS 2.1.1 (Windows 8 0.0.0) ERROR
  Disconnected, because no message in 10000 ms.

 [32mFinished in 10.004 secs / 0 secs [39m
      
~~~~