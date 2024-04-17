Smart Offices
Smart devices/services: Light, Heating, Window

gRPC

CLI/GUI

=========================================

Todo:
*** make the consul open running!!!
1. update protos -
- delete the (Area) -- only one room! (multi rooms - one room)
- change the sensor -- from temp sensor to environment sensor
- occupancy sensor -- can connect? control? the other streaming (on/off)
2. mvn clean install
3. mvn clean compile
4. 1 server
5. 3 clients
6. 3 services (serviceImpl)


Design details:
1. Smart Light - Occupancy Sensor
- detect occupancy - use "0" OR "1" to stored in the .csv file
- detect how many people are in the office.
- if the number of people ("NumPeople") > 0, auto turn on the light, 
- if NumPeople == 0, auto turn off the light after 30 seconds

***
- if check there is people, the occupancy sensor, environment sensor, and wind sensor will stream the data to the server, 
- so that the server can turn ON/OFF the device.
- if check there is no people in the office, stop streaming the data. 
- (this means, if there is no people in the room, the lights, heating, and windows will not auto-turn on or turn off)


2. Smart Heating - Environment Sensor 
- detect the room temp, humidity, air pollution(PM2.5)
- check if the temp. is lower than 19 degree Celsius.
- if < 19 degree Celsius, then, turn on the heating device.
- if the temp is > 23 degree Celsius, then auto turn off the heating device.
- (keep the room temp. between 19-23)


3. Smart Window - Wind Sensor 
- detect: Wind Direction, Wind speed, Wind Temperature
- if temp. < 9 degree Celsius, OR, speed > 40 km/h, auto close the window


3. main controller - SmartOfficeController (SmartOfficeApp)
Menu: (CLI / GUI)
choose the device (lights, heating, windows);
choose the operation (turn on/off, brightness -/+, temp. -/+, open/close, tint darker/lighter)
- get CurrentTemperature
- StreamTemperature (call gRPC)(it will give Response every 15 seconds)
- turn on/off (close the streaming)-(but sensor still store the data to the .csv file)

the outline is on the .pdf

// 占用传感器是一种能够检测运动并识别人员何时进入房间的电子设备。
==========================================

Marking:
Service definitions are well-structured and clearly defined. gRPC usage demonstrates advanced understanding and implementation. Protobuf definitions are comprehensive and effectively utilised.

For each of the 3 different services/devices a corresponding proto file is defined and used

All 4 different types of RPC invocation styles have been used (simple RPC, server-side streaming RPC, client-side streaming RPC, bidirectional streaming RPC)
