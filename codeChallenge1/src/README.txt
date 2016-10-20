The target is to read the data of employee from a datasource,
group them into 3 lists. one list contains employees with age
below 30, next one with employees age between 30 and 40 both inclusive
and the third one with age greater than 40.



EmployeeAgeTest class has the main method.
1. It reads data from the data source passes it into a List object.
2. The the service class is instantiated and the list object is passed to the 
   sortedByAgeArrayObjs(List<Employee>) method which returns an array with 3 list
   objects.
3. Then as per the requirement the appropriate object is retrieved from the array by the user
   by giving apt choices on the console.	