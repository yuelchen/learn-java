# Write your MySQL query statement below

SELECT Employee.Name AS Employee
FROM Employee, Employee AS Manager
Where Employee.Salary > Manager.Salary
AND Employee.ManagerId=Manager.Id
