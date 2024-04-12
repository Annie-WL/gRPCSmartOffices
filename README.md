Smart Offices
Smart devices/services: Lights, Heating, Windows

gRPC

CLI

=========================================

Todo: 
# /////
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


Design update:
1. Smart Light - Occupancy Sensor
- detect occupancy - use "0" OR "1" to stored in the .csv file
- detect how many people are in the office.
- if the number of people ("NumPeople") > 0, auto turn on the light, if == 0, auto turn off the light

***
- if check there is people, the occupancy sensor, environment sensor, and wind sensor will stream the data to the server, 
- so that the server can turn ON/OFF the device.
- if check, there is no people in the office, stop streaming the data. 
- (this means, if there is no people in the room, the lights, heating, and windows will not auto-turn on or off)


2. Smart Heating - Environment Sensor 
- detect the room temp, humidity, air pollution(PM2.5)
- check if the temp. is lower than 19 degree Celsius.
- if < 19 degree Celsius, then, turn on the heating device.
- if the temp is > 23 degree Celsius, then auto turn off the heating device.


3. Smart Window - Wind Sensor 
- detect: Wind Direction, Wind speed, Wind Temperature
- if temp. < 10 degree Celsius, OR, speed > 4.8 km/h, auto close the window


3. main controller - SmartOfficeController (SmartOfficeApp)
Menu: (CLI / GUI)
# choose the Area(Office1 area-1 && Office2 area-2 && Meeting Room-3); --- only one room left!
choose the device (lights, heating, windows);
choose the operation (turn on/off, brightness -/+, temp. -/+, open/close, tint darker/lighter)


the outline is on the .pdf

// 占用传感器是一种能够检测运动并识别人员何时进入房间的电子设备。
==========================================

Marking:
Service definitions are well-structured and clearly defined. gRPC usage demonstrates advanced understanding and implementation. Protobuf definitions are comprehensive and effectively utilised.

For each of the 3 different services/devices a corresponding proto file is defined and used

All 4 different types of RPC invocation styles have been used (simple RPC, server-side streaming RPC, client-side streaming RPC, bidirectional streaming RPC)
