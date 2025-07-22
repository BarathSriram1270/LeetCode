with tab as(select c.id,c.name,o.customerId
from customers c
left join orders o
on c.id=o.customerId)
select name as Customers 
from tab
where customerid is null;