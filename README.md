<b> <h1> <p align="center" >   # Appium Mobile Atomation Tutorial # </h1> </b>  </p>


<b> <h2><p align="center" > (Ios-Android-Remote Device)</h2> </b>  </p>
<p align="center"> <img src="https://user-images.githubusercontent.com/38845669/159143080-b61c870b-91dc-48a8-b34d-33910f2e4507.png" width="500" height="150"></p>

&nbsp; 
-------------------------------------------------------------
### Configure device information

#### Android Device
###### */src/main/java/com/erdioran/driver/LocalDeviceAndroid*

###### Open terminal -> _adb devices_ -> Add to DEVICE_NAME

#### IOS Device
###### */src/main/java/com/erdioran/driver/LocalDeviceIos*

###### Learn Apple developer and device information using XCODE

###### xcodeOrgId : Apple Developer Team Organization ID

###### UDID : Device ID
#### Remote Device (Browserstack)
###### *src/main/java/com/erdioran/driver/BrowserStackDevice*

###### accessKey and userName -> browserstack.com -> Dashboard

&nbsp;
-------------------------------------------------------------
#### After making the driver settings, go to the config file and select the driver you will use.
###### */src/test/resources/config/config.properties*
###### ``LOCALIOS`` - ``LOCALANDROID`` - ``BS``
-------------------------------------------------------------

|         | VERSION |
| -------| ----- |
| Appium   | 7.0.0  |
| Selenium | 3.141.59|
