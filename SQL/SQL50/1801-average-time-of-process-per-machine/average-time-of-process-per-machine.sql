# Write your MySQL query statement below
select a1.machine_id, ROUND(AVG(a2.timestamp - a1.timestamp), 3) AS processing_time 
from Activity as a1
inner join Activity as a2
ON a1.process_id = a2.process_id 
AND a1.machine_id = a2.machine_id 
AND a1.activity_type = 'Start' AND a2.activity_type = 'END'
GROUP BY a1.machine_id;
