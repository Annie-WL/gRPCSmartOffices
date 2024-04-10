Smart Offices
Smart devices/services: Lights, Heating, Windows

gRPC

CLI

=========================================

Todo: 
1. update protos -- room temp. change
2. mvn clean install
3. mvn clean compile
4. 1 server
5. 3 clients


Details update:
1. Smart Lights - Occupancy Sensor
- detect if there is people or not (1 / 0),
- if have people (1), then, auto-turn on the light. (when people go into the Room)

2. Smart Heating - Temperature Sensor 
- check if the temp. is lower than 19 degree Celsius,
- if < 19, then, turn on the heating device.
- maintain the temp. around 19

3. Smart Windows - Wind Sensor 
- detect: Wind Direction(?), Wind speed, Wind Temperature
- if temp. < 10 degree Celsius, OR, speed > 4.8 km/h
- then, auto close the window.

3. main controller - SmartOfficeController (SmartOfficeApp)
Menu: (CLI / GUI)
choose the Area(Office1 area-1 && Office2 area-2 && Meeting Room-3);
choose the device (lights, heating, windows);
choose the operation (turn on/off, brightness -/+, temp. -/+, open/close, tint darker/lighter)


the outline is on the .pdf


==========================================

Marking:
Service definitions are well-structured and clearly defined. gRPC usage demonstrates advanced understanding and implementation. Protobuf definitions are comprehensive and effectively utilised.

For each of the 3 different services/devices a corresponding proto file is defined and used

All 4 different types of RPC invocation styles have been used (simple RPC, server-side streaming RPC, client-side streaming RPC, bidirectional streaming RPC)
