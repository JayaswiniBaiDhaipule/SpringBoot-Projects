SELECT ot.id, ot.first_name, ot.last_name, ot.gender, ot.city, 
ot.state, ot.mobile_number, ot.email_id, ot.pet_id,  
pt.name, pt.gender, pt.type, dpt.date_of_birth, 
wpt.place_of_birth 
FROM owner_table ot  
JOIN pet_table pt ON pt.id = ot.pet_id
LEFT JOIN domestic_pet_table dpt ON pt.id = dpt.id 
LEFT JOIN wild_pet_table wpt ON pt.id = wpt.id; 

select * from domestic_pet_table;

select * from owner_table;

select * from pet_table;

select * from wild_pet_table;