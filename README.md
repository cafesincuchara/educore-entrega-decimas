Nombre del estudiante: Vicente Herrera

!SE CREO CON JPA  
Aqui dejo una captura del H2 funcionando:

<img width="609" height="371" alt="image" src="https://github.com/user-attachments/assets/0d4462de-92a0-41e2-9c2a-c3852eb46cd7" />


1. Listar todos los registros
Obtiene la lista completa de todos los registros almacenados en la base de datos.

URL: http://localhost:8080/api/v1/registros

Método: GET

<img width="882" height="588" alt="image" src="https://github.com/user-attachments/assets/734be7a9-6f68-4af0-8082-0162b809bc2d" />

2. Crear un nuevo registro
Permite registrar un nuevo usuario/entidad. Es obligatorio enviar todos los campos definidos en el modelo.

URL: http://localhost:8080/api/v1/registros

Método: POST

<img width="871" height="655" alt="image" src="https://github.com/user-attachments/assets/020186c3-4957-40f1-8514-1b9b937f7dbc" />

3. Obtener registro por ID
Busca y retorna la información detallada de un registro específico mediante su identificador único.

URL: http://localhost:8080/api/v1/registros/1

Método: GET

<img width="942" height="663" alt="image" src="https://github.com/user-attachments/assets/07b39f46-ae4c-4f9d-a36b-5e61f6018db6" />

4. Actualizar registro existente
Modifica los datos de un registro ya existente. Se debe proporcionar el ID tanto en la URL como en el cuerpo del JSON.

URL: http://localhost:8080/api/v1/registros/1

Método: PUT

<img width="863" height="647" alt="image" src="https://github.com/user-attachments/assets/56c024a2-1538-439f-9322-6e36795601ed" />

5. Eliminar registro
Elimina de forma permanente un registro de la base de datos según el ID proporcionado.

URL: http://localhost:8080/api/v1/registros/1

Método: DELETE

<img width="910" height="564" alt="image" src="https://github.com/user-attachments/assets/a7065533-a7e0-42ce-8b60-c4e7c37482a8" />
