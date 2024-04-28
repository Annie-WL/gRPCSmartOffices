Smart Offices
Smart devices/services: Light, Heating, Window

# HOW TO RUN:

For the Server and Sensor Device:
- Run the "SmartOfficeServer.java" first, 
- then can run the 3 SensorDevice separately.

For the GUI part:
- Run the "SmartOfficeServer.java" first, 
- then run the "SmartOfficeApp.java", the UI will appear.
(because I have the 'module-info.java', so I can directly run the 'SmartOfficeApp')



==================================================================================================


Design details:
1. Smart Light - Occupancy Sensor
- detect occupancy - use "0" OR "1" to stored in the .csv file
- detect how many people are in the office.
- if the number of people ("NumPeople") > 0, auto turn on the light, 
- if NumPeople == 0, auto turn off the light after 30 seconds

2. Smart Heating - Environment Sensor 
- detect the room temp, humidity, air pollution(PM2.5)
- check if the temp. is lower than 19 degree Celsius.
- if < 19 degree Celsius, then, turn on the heating device.
- if the temp is > 23 degree Celsius, then auto turn off the heating device.
- (keep the room temp. between 19-23)

3. Smart Window - Wind Sensor 
- detect: Wind Direction, Wind speed, Wind Temperature
- if temp. < 9 degree Celsius, OR, speed > 40 km/h, auto close the window


3. main controller - SmartOfficeController (com.project.app.SmartOfficeApp)
Menu: (CLI / GUI)
Get Current Temperature
Get Number of People
Get Current Wind Speed


==================================================================================================


mvn clean install
mvn clean compile
1 server -  3 clients - 3 services (serviceImpl)
