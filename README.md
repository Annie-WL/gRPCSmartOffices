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

Details：
1. lights - 根据时间 - 节能模式 - 8:00AM - 8:00PM 为上班模式，其余时间为节能模式
2. Heating - 同样根据时间 - 节能模式 && 查找冬天and夏天，办公室人体最舒适空调温度(reference!)
3. Window Blinds - 根据天气:
- if 阴天，打开窗帘 && if 晴天，拉上窗帘/only遮阳板，需要透光 - 不怎么开灯 - 节能


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
Menu: 
choose the Area(Office area-1 && Meeting Room-2);
choose the device (lights, heating, windows);
choose the operation (turn on/off, brightness -/+, temp. -/+, open/close, tint darker/lighter)


the outline is on the .pdf


==========================================

Marking:
Service definitions are well-structured and clearly defined. gRPC usage demonstrates advanced understanding and implementation. Protobuf definitions are comprehensive and effectively utilised.

For each of the 3 different services/devices a corresponding proto file is defined and used

All 4 different types of RPC invocation styles have been used (simple RPC, server-side streaming RPC, client-side streaming RPC, bidirectional streaming RPC)
