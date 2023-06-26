/*------1------*/
select Dname,Dnum,Fname
from employee as e ,departments as d
where e.Dno=d.Dnum and d.MGRSSN=e.SSN;
/*------2-----*/
select d.Dname,p.Pname
from departments as d , project as p
where p.Dnum=d.Dnum;
/*------3-----*/
select d.* ,e.Fname as 'The Employee'
from dependent as d, employee as e
where d.ESSN=e.SSN;
/*-------4-----*/
select d.dependent_name, e.Fname
from dependent as d , employee as e
where d.ESSN=e.SSN and sex ='F' and gender = 'F'
UNION
select d.dependent_name, e.Fname
from dependent as d , employee as e
where d.ESSN=e.SSN and sex ='M' and gender = 'M';
/*--------5------*/
select Pnumber, Pname , Plocation
from project
where City !='Giza';
/*----------6-----*/
select * 
from project
where Pname like 'A%';
/*-----------7--------*/
select *
from employee 
where dno='30' and Salary >=1000 and Salary <=2000;
/*------------8--------*/
select concat(Fname,Lname) as Name 
from employee as e ,project as p ,works_for as w
where e.SSN=w.ESSN and p.Pnumber=w.Pno and Dnum = '10' and Pname='Al Rabwah' and Hours >=10;
/*-----------9--------*/
select e.Fname ,e.Lname
from employee as e , employee as s 
where s.SSN=e.SSN and e.Superssn=(select SSN from employee where Fname='Kamel');
/*------------10---------*/
select p.Pname , sum(Hours)
from project as p , works_for as w
where p.Pnumber=w.Pno
group by p.Pname;
/*-----------11----------*/
select e.Fname,p.Pname
from employee as e,works_for as w,project as p
where e.SSN=w.ESSn and p.Pnumber=w.Pno
order by p.Pname;
/*---------12---------*/
select d.* ,min(SSN)
from departments as d , employee as e
where d.Dnum=e.Dno; 
/*-----------13------*/
select Dname , max(Salary), min(Salary), avg(Salary)
from departments as d ,employee as e
where e.Dno=d.Dnum 
group by Dname;
/*----------14--------*/
select e.Fname
from employee as e , departments as d ,dependent as dp
where dp.ESSN=d.MGRSSN and e.SSN=dp.ESSN and d.MGRSSN not in (Select ESSN from dependent);
/*---------15--------*/
select d.Dname,d.Dnum , avg(Salary) as AVG_Salary 
from departments as d ,employee as e
where d.Dnum=e.Dno 
group by d.Dname,d.Dnum
having AVG_Salary<(select avg(Salary) from employee);
/*--------------16--------*/
select e.*,d.Dname,p.*
from employee as e,departments as d ,project as p , works_for as w
where d.Dnum=e.Dno and e.SSN=w.ESSn and p.Pnumber=w.Pno
order by d.Dname,Lname desc , Fname desc;
/*----------------17--------*/
select p.Pnumber, d.Dname ,e.Fname , e.Lname ,e.Address, e.Bdate
from project as p,works_for as w,employee as e,departments as d
where p.Pnumber=w.Pno and e.SSN=w.ESSn and d.MGRSSN=e.SSN and p.city='Cairo';