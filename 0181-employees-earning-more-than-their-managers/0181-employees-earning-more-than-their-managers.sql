SELECT e.name AS Employee
FROM Employee e
join employee m
on e.managerId=m.id
where e.salary>m.salary;

