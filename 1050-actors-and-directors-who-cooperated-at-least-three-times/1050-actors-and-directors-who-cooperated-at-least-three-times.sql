select actor_id,director_id
from actordirector
group by actor_id,director_id
having count(timestamp)>2;