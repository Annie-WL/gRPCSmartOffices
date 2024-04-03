Smart Offices
Smart devices/services: Lighting, Heating, Window Blinds

gRPC

CLI

=========================================

Todo: 
1. 更改proto细节 - 更合理
2. mvn clean install
3. mvn clean compile
4. 写service
5. 写client

Details：
1. lights - 根据时间 - 节能模式 - 8:00AM - 8:00PM 为上班模式，其余时间为节能模式
2. Heating - 同样根据时间 - 节能模式 && 查找冬天and夏天，办公室人体最舒适空调温度(reference!)
3. Window Blinds - 根据天气:
- if 阴天，打开窗帘 && if 晴天，拉上窗帘/only遮阳板，需要透光 - 不怎么开灯 - 节能

==========================================

Marking:
Service definitions are well-structured and clearly defined. gRPC usage demonstrates advanced understanding and implementation. Protobuf definitions are comprehensive and effectively utilised.

For each of the 3 different services/devices a corresponding proto file is defined and used

All 4 different types of RPC invocation styles have been used (simple RPC, server-side streaming RPC, client-side streaming RPC, bidirectional streaming RPC)
