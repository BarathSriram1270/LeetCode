select f.firstName as firstName, f.lastName as lastName, s.city as city , s.state as state
from person f
left join address s
on f.personId=s.personId;
