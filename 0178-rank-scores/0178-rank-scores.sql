select s.score , count(s2.score) as rank
from scores s,(select distinct score from scores) s2
where s2.score<=s.score
group by s.id
order by s.score desc;
