select player_id,event_date as first_login
from activity
group by player_id
having min(event_date);
