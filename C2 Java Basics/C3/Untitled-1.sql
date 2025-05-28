["EMPLEADOS"].insert([
  { "nombre": "Laura Gómez", "edad": 30, "departamento": "Recursos Humanos", "sueldo": 2500 },
  { "nombre": "Carlos Pérez", "edad": 40, "departamento": "Finanzas", "sueldo": 3200 },
  { "nombre": "Ana Torres", "edad": 28, "departamento": "Marketing", "sueldo": 2700 },
  { "nombre": "Luis Martín", "edad": 35, "departamento": "Ventas", "sueldo": 2900 },
  { "nombre": "Sofía López", "edad": 33, "departamento": "IT", "sueldo": 3500 },
  { "nombre": "Mario Sánchez", "edad": 31, "departamento": "Atención al Cliente", "sueldo": 2300 },
  { "nombre": "Elena Ruiz", "edad": 38, "departamento": "Logística", "sueldo": 2600 },
  { "nombre": "Jorge Ortega", "edad": 45, "departamento": "Legal", "sueldo": 4000 },
  { "nombre": "Lucía Moreno", "edad": 29, "departamento": "Operaciones", "sueldo": 2800 },
  { "nombre": "David Jiménez", "edad": 36, "departamento": "Compras", "sueldo": 3100 }
]
)
["Departamentos"].insertOne ([
  { "codigo": "D001", "nombre": "Recursos Humanos", "ubicacion": "Madrid" },
  { "codigo": "D002", "nombre": "Finanzas", "ubicacion": "Barcelona" },
  { "codigo": "D003", "nombre": "Marketing", "ubicacion": "Valencia" },
  { "codigo": "D004", "nombre": "Ventas", "ubicacion": "Sevilla" },
  { "codigo": "D005", "nombre": "IT", "ubicacion": "Bilbao" },
  { "codigo": "D006", "nombre": "Atención al Cliente", "ubicacion": "Zaragoza" },
  { "codigo": "D007", "nombre": "Logística", "ubicacion": "Málaga" },
  { "codigo": "D008", "nombre": "Legal", "ubicacion": "Valladolid" },
  { "codigo": "D009", "nombre": "Operaciones", "ubicacion": "Murcia" },
  { "codigo": "D010", "nombre": "Compras", "ubicacion": "Alicante" }
]
)
["proveedores"].insert([
  { "codigo": "F001", "nombre": "Lenovo", "pais": "China", "fundado": 1984 },
  { "codigo": "F002", "nombre": "HP", "pais": "Estados Unidos", "fundado": 1939 },
  { "codigo": "F003", "nombre": "Samsung", "pais": "Corea del Sur", "fundado": 1938 },
  { "codigo": "F004", "nombre": "Logitech", "pais": "Suiza", "fundado": 1981 },
  { "codigo": "F005", "nombre": "TP-Link", "pais": "China", "fundado": 1996 },
  { "codigo": "F006", "nombre": "Microsoft", "pais": "Estados Unidos", "fundado": 1975 },
  { "codigo": "F007", "nombre": "Apple", "pais": "Estados Unidos", "fundado": 1976 },
  { "codigo": "F008", "nombre": "Asus", "pais": "Taiwán", "fundado": 1989 },
  { "codigo": "F009", "nombre": "Acer", "pais": "Taiwán", "fundado": 1976 },
  { "codigo": "F010", "nombre": "Dell", "pais": "Estados Unidos", "fundado": 1984 }
]
)
["productos"].insert([
  { "codigo": "P001", "nombre": "Portátil Lenovo", "categoria": "Informática", "precio": 850.00, "stock": 12 },
  { "codigo": "P002", "nombre": "Mouse Inalámbrico", "categoria": "Accesorios", "precio": 20.00, "stock": 50 },
  { "codigo": "P003", "nombre": "Teclado Mecánico", "categoria": "Accesorios", "precio": 45.00, "stock": 30 },
  { "codigo": "P004", "nombre": "Monitor 24\"", "categoria": "Informática", "precio": 150.00, "stock": 18 },
  { "codigo": "P005", "nombre": "Disco SSD 1TB", "categoria": "Almacenamiento", "precio": 120.00, "stock": 25 },
  { "codigo": "P006", "nombre": "Impresora HP", "categoria": "Oficina", "precio": 95.00, "stock": 10 },
  { "codigo": "P007", "nombre": "Silla ergonómica", "categoria": "Mobiliario", "precio": 199.99, "stock": 7 },
  { "codigo": "P008", "nombre": "Router WiFi", "categoria": "Redes", "precio": 60.00, "stock": 20 },
  { "codigo": "P009", "nombre": "Tablet Samsung", "categoria": "Electrónica", "precio": 220.00, "stock": 14 },
  { "codigo": "P010", "nombre": "Cámara Web HD", "categoria": "Accesorios", "precio": 30.00, "stock": 35 }
]
)