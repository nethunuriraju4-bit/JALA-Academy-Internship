-- Q1
SELECT snum, sname, city, comm FROM salespeople;

-- Q2
SELECT DISTINCT snum FROM orders;

-- Q3
SELECT sname, comm FROM salespeople WHERE city = 'London';

-- Q4
SELECT * FROM cust WHERE rating = 100;

-- Q5
SELECT onum, amt, odate FROM orders;

-- Q6
SELECT * FROM cust
WHERE city = 'San Jose' AND rating > 200;

-- Q7
SELECT * FROM cust
WHERE city = 'San Jose' OR rating > 200;

-- Q8
SELECT * FROM orders WHERE amt > 1000;

-- Q9
SELECT sname, city FROM salespeople
WHERE city = 'London' AND comm > 0.10;

-- Q10
SELECT * FROM cust
WHERE rating > 100 OR city = 'Rome';

-- Q11
SELECT * FROM salespeople
WHERE city IN ('Barcelona', 'London');

-- Q12
SELECT * FROM salespeople
WHERE comm > 0.10 AND comm < 0.12;

-- Q13
SELECT * FROM cust
WHERE city IS NULL;

-- Q14
SELECT * FROM orders
WHERE odate IN ('1994-10-03', '1994-10-04');

-- Q15
SELECT c.*
FROM cust c
JOIN salespeople s ON c.snum = s.snum
WHERE s.sname IN ('Peel', 'Motika');

-- Q16
SELECT * FROM cust
WHERE cname >= 'A' AND cname < 'C';

-- Q17
SELECT * FROM orders
WHERE amt <> 0 AND amt IS NOT NULL;

-- Q18
SELECT COUNT(DISTINCT snum) AS number_of_salespeople
FROM orders;

-- Q19
SELECT s.snum, s.sname, o.onum, o.amt, o.odate
FROM salespeople s
JOIN orders o ON s.snum = o.snum
WHERE o.odate = (
    SELECT MAX(o2.odate)
    FROM orders o2
    WHERE o2.snum = o.snum
);

-- Q20
SELECT s.snum, s.sname, o.onum, o.amt
FROM salespeople s
JOIN orders o ON s.snum = o.snum
WHERE o.amt > 3000
AND o.amt = (
    SELECT MAX(o2.amt)
    FROM orders o2
    WHERE o2.snum = o.snum
    AND o2.amt > 3000
);

-- Q21
SELECT odate, SUM(amt) AS total_amount
FROM orders
GROUP BY odate
ORDER BY total_amount DESC
LIMIT 1;

-- Q22
SELECT COUNT(*) AS order_count
FROM orders
WHERE odate = '1994-10-03';

-- Q23
SELECT COUNT(DISTINCT city) AS different_cities
FROM cust
WHERE city IS NOT NULL;

-- Q24
SELECT c.cnum, c.cname, MIN(o.amt) AS smallest_order
FROM cust c
JOIN orders o ON c.cnum = o.cnum
GROUP BY c.cnum, c.cname;

-- Q25
SELECT cname
FROM cust
WHERE cname LIKE 'G%'
ORDER BY cname
LIMIT 1;

-- Q26
SELECT DATE_FORMAT(odate, '%d/%m/%y') AS order_date,
       COUNT(*) AS order_count
FROM orders
GROUP BY odate;

-- Q27
SELECT onum, snum, amt * 0.12 AS commission
FROM orders;

-- Q28
SELECT city, MAX(rating) AS highest_rating
FROM cust
GROUP BY city;

-- Q29
SELECT odate, SUM(amt) AS total_amount
FROM orders
GROUP BY odate
ORDER BY total_amount DESC;

-- Q30
SELECT s.sname, c.cname, s.city
FROM salespeople s
JOIN cust c ON s.city = c.city;

-- Q31
SELECT c.cname, s.sname
FROM cust c
JOIN salespeople s ON c.snum = s.snum;

-- Q32
SELECT o.onum, c.cname
FROM orders o
JOIN cust c ON o.cnum = c.cnum;

-- Q33
SELECT o.onum, s.sname, c.cname
FROM orders o
JOIN salespeople s ON o.snum = s.snum
JOIN cust c ON o.cnum = c.cnum;

-- Q34
SELECT c.*
FROM cust c
JOIN salespeople s ON c.snum = s.snum
WHERE s.comm > 0.12;

-- Q35
SELECT o.onum, o.amt * s.comm AS commission
FROM orders o
JOIN salespeople s ON o.snum = s.snum
JOIN cust c ON o.cnum = c.cnum
WHERE c.rating > 100;

-- Q36
SELECT c1.cname, c2.cname, c1.rating
FROM cust c1
JOIN cust c2
ON c1.rating = c2.rating
AND c1.cnum <> c2.cnum;

-- Q37
SELECT c1.cname, c2.cname, c1.rating
FROM cust c1
JOIN cust c2
ON c1.rating = c2.rating
AND c1.cnum < c2.cnum;

-- Q38
SELECT c.cname, s.sname
FROM cust c
CROSS JOIN salespeople s;

-- Q39
SELECT *
FROM cust
WHERE city IN (
    SELECT c.city
    FROM cust c
    JOIN salespeople s ON c.snum = s.snum
    WHERE s.sname = 'Serres'
);

-- Q40
SELECT c1.cname, c2.cname, c1.snum
FROM cust c1
JOIN cust c2
ON c1.snum = c2.snum
AND c1.cnum < c2.cnum;

-- Q41
SELECT s1.sname, s2.sname, s1.city
FROM salespeople s1
JOIN salespeople s2
ON s1.city = s2.city
AND s1.snum < s2.snum;

-- Q42
SELECT c.cname, o1.onum, o2.onum
FROM cust c
JOIN orders o1 ON c.cnum = o1.cnum
JOIN orders o2 ON c.cnum = o2.cnum
AND o1.onum < o2.onum;

-- Q43
SELECT cname, city, rating
FROM cust
WHERE rating = (
    SELECT rating
    FROM cust
    WHERE cname = 'Hoffman'
);

-- Q44
SELECT o.*
FROM orders o
JOIN salespeople s ON o.snum = s.snum
WHERE s.sname = 'Motika';

-- Q45
SELECT *
FROM orders
WHERE snum = (
    SELECT snum
    FROM cust
    WHERE cname = 'Hoffman'
);

-- Q46
SELECT *
FROM orders
WHERE amt > (
    SELECT AVG(amt)
    FROM orders
    WHERE odate = '1994-10-04'
);

-- Q47
SELECT AVG(comm) AS average_commission
FROM salespeople
WHERE city = 'London';

-- Q48
SELECT o.*
FROM orders o
JOIN cust c ON o.cnum = c.cnum
WHERE c.city = 'London';

-- Q49
SELECT DISTINCT s.sname, s.comm
FROM salespeople s
JOIN cust c ON s.snum = c.snum
WHERE c.city = 'London';

-- Q50
SELECT *
FROM cust
WHERE cnum = (
    SELECT snum + 1000
    FROM salespeople
    WHERE sname = 'Serres'
);

-- Q51
SELECT COUNT(*) AS customer_count
FROM cust
WHERE rating > (
    SELECT AVG(rating)
    FROM cust
    WHERE city = 'San Jose'
);

-- Q52
SELECT o.*
FROM orders o
JOIN cust c ON o.cnum = c.cnum
WHERE c.cname = 'Cisnerous';

-- Q53
SELECT c.cname, c.rating
FROM cust c
WHERE (
    SELECT AVG(o.amt)
    FROM orders o
    WHERE o.cnum = c.cnum
) > (
    SELECT AVG(amt)
    FROM orders
);

-- Q54
SELECT s.snum, s.sname, SUM(o.amt) AS total_amount
FROM salespeople s
JOIN orders o ON s.snum = o.snum
GROUP BY s.snum, s.sname
HAVING SUM(o.amt) > (
    SELECT MAX(amt)
    FROM orders
);

-- Q55
SELECT DISTINCT c.*
FROM cust c
JOIN orders o ON c.cnum = o.cnum
WHERE o.odate = '1994-10-03';

-- Q56
SELECT s.sname, s.snum
FROM salespeople s
JOIN cust c ON s.snum = c.snum
GROUP BY s.snum, s.sname
HAVING COUNT(c.cnum) > 1;

-- Q57
SELECT o.onum, o.cnum,
       o.snum AS credited_snum,
       c.snum AS correct_snum
FROM orders o
JOIN cust c ON o.cnum = c.cnum
WHERE o.snum <> c.snum;

-- Q58
SELECT o.*
FROM orders o
WHERE o.amt > (
    SELECT AVG(o2.amt)
    FROM orders o2
    WHERE o2.cnum = o.cnum
);

-- Q59
SELECT odate, SUM(amt) AS total_amount
FROM orders
GROUP BY odate
HAVING SUM(amt) >= (
    SELECT MAX(amt) FROM orders
) + 2000;

-- Q60
SELECT cnum, cname, city, rating
FROM cust c
WHERE rating = (
    SELECT MAX(c2.rating)
    FROM cust c2
    WHERE c2.city = c.city
);

-- Q61
SELECT DISTINCT s.snum, s.sname, s.city
FROM salespeople s
JOIN cust c ON s.city = c.city
WHERE c.snum <> s.snum;

-- Q62
SELECT cnum, cname, city
FROM cust
WHERE EXISTS (
    SELECT 1
    FROM cust
    WHERE city = 'San Jose'
);

-- Q63
SELECT snum
FROM cust
GROUP BY snum
HAVING COUNT(*) > 1;

-- Q64
SELECT s.snum, s.sname, s.city
FROM salespeople s
JOIN cust c ON s.snum = c.snum
GROUP BY s.snum, s.sname, s.city
HAVING COUNT(c.cnum) > 1;

-- Q65
SELECT s.snum, s.sname
FROM salespeople s
JOIN cust c ON s.snum = c.snum
GROUP BY s.snum, s.sname
HAVING COUNT(c.cnum) = 1;

-- Q66
SELECT s.snum, s.sname, COUNT(o.onum) AS order_count
FROM salespeople s
JOIN orders o ON s.snum = o.snum
GROUP BY s.snum, s.sname
HAVING COUNT(o.onum) > 1;

-- Q67
SELECT s.*
FROM salespeople s
WHERE EXISTS (
    SELECT 1
    FROM cust c
    WHERE c.snum = s.snum
    AND c.rating = 300
);

-- Q68
SELECT DISTINCT s.*
FROM salespeople s
JOIN cust c ON s.snum = c.snum
WHERE c.rating = 300;

-- Q69
SELECT s.*
FROM salespeople s
WHERE EXISTS (
    SELECT 1
    FROM cust c
    WHERE c.city = s.city
    AND c.snum <> s.snum
);

-- Q70
SELECT DISTINCT c.*
FROM cust c
WHERE EXISTS (
    SELECT 1
    FROM cust c2
    JOIN orders o ON c2.cnum = o.cnum
    WHERE c2.snum = c.snum
    AND c2.cnum <> c.cnum
);

-- Q71
SELECT s.*
FROM salespeople s
WHERE s.city IN (
    SELECT city FROM cust
);

-- Q72
SELECT s.*
FROM salespeople s
WHERE EXISTS (
    SELECT 1
    FROM cust c
    WHERE s.sname < c.cname
);

-- Q73
SELECT *
FROM cust
WHERE rating > ANY (
    SELECT rating
    FROM cust
    WHERE city = 'Rome'
);

-- Q74
SELECT *
FROM orders
WHERE amt > ANY (
    SELECT amt
    FROM orders
    WHERE odate = '1994-10-06'
);

-- Q75
SELECT *
FROM orders
WHERE amt < ANY (
    SELECT o.amt
    FROM orders o
    JOIN cust c ON o.cnum = c.cnum
    WHERE c.city = 'San Jose'
);

-- Q76
SELECT *
FROM cust
WHERE rating > ALL (
    SELECT rating
    FROM cust
    WHERE city = 'Paris'
);

-- Q77
SELECT *
FROM cust
WHERE rating >= ANY (
    SELECT c.rating
    FROM cust c
    JOIN salespeople s ON c.snum = s.snum
    WHERE s.sname = 'Serres'
);

-- Q78
SELECT s.*
FROM salespeople s
WHERE s.city <> ALL (
    SELECT city
    FROM cust
);

-- Q79
SELECT *
FROM orders
WHERE amt > ANY (
    SELECT o.amt
    FROM orders o
    JOIN cust c ON o.cnum = c.cnum
    WHERE c.city = 'London'
);

-- Q80
SELECT s.sname AS salesperson,
       c.cname AS customer
FROM salespeople s
JOIN cust c ON s.city = c.city
WHERE s.city = 'London';

-- Q81
SELECT s.sname,
       MAX(o.amt) AS highest_order,
       MIN(o.amt) AS lowest_order
FROM salespeople s
JOIN orders o ON s.snum = o.snum
GROUP BY s.snum, s.sname;

-- Q82
SELECT s.sname,
       CASE
           WHEN EXISTS (
               SELECT 1
               FROM cust c
               WHERE c.city = s.city
               AND c.snum = s.snum
           )
           THEN 'Have customers'
           ELSE 'No customers'
       END AS status
FROM salespeople s;

-- Q83
SELECT s.sname,
       CASE
           WHEN EXISTS (
               SELECT 1
               FROM cust c
               WHERE c.city = s.city
               AND c.snum = s.snum
           )
           THEN 'Matched'
           ELSE 'Not Matched'
       END AS status
FROM salespeople s;

-- Q84
SELECT cname, city, rating, 'High Rating' AS rating_status
FROM cust
WHERE rating >= 200
UNION
SELECT cname, city, rating, 'Low Rating' AS rating_status
FROM cust
WHERE rating < 200;

-- Q85
SELECT sname AS name, snum AS number
FROM salespeople
WHERE snum IN (
    SELECT snum
    FROM orders
    GROUP BY snum
    HAVING COUNT(*) > 1
)
UNION
SELECT c.cname AS name, c.cnum AS number
FROM cust c
WHERE c.cnum IN (
    SELECT cnum
    FROM orders
    GROUP BY cnum
    HAVING COUNT(*) > 1
)
ORDER BY name;

-- Q86
SELECT snum AS number
FROM salespeople
WHERE city = 'San Jose'
UNION
SELECT cnum AS number
FROM cust
WHERE city = 'San Jose'
UNION ALL
SELECT onum AS number
FROM orders
WHERE odate = '1994-10-03';

-- Q87
SELECT s.*
FROM salespeople s
WHERE s.city = 'London'
AND EXISTS (
    SELECT 1
    FROM cust c
    WHERE c.snum = s.snum
    AND c.city = 'London'
);

-- Q88
SELECT s.*
FROM salespeople s
WHERE s.city = 'London'
AND NOT EXISTS (
    SELECT 1
    FROM cust c
    WHERE c.snum = s.snum
    AND c.city = 'London'
);

-- Q89
SELECT s.snum, s.sname, s.city, c.cname
FROM salespeople s
LEFT JOIN cust c
ON s.snum = c.snum;