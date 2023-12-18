SELECT biblioteca, COUNT(*) AS cantidad_ejemplares
FROM tabla_ejemplares
WHERE isbn = '9788417051341' AND fecha_actualizacion <= '2020-06-21'
GROUP BY biblioteca
ORDER BY cantidad_ejemplares ASC;

SELECT e.titulo, c.dni
FROM tabla_ejemplares e
JOIN tabla_clientes c ON e.id_cliente = c.id_cliente
WHERE c.nombre = 'AMETS ARZALLUS'
AND e.fecha_prestamo <= DATE_SUB(CURDATE(), INTERVAL 21 DAY)
AND e.fecha_devolucion IS NULL;
