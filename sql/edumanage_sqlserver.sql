CREATE DATABASE EduManage;
GO

USE EduManage;
GO

 CREATE TABLE Estudiantes (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    Nombre NVARCHAR(100) NOT NULL,
    Apellido NVARCHAR(100) NOT NULL,
    Correo NVARCHAR(100) NOT NULL UNIQUE,
    Telefono NVARCHAR(20),
    Fecha_Registro DATE DEFAULT GETDATE()
);
GO

 CREATE TABLE Cursos (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    Nombre NVARCHAR(100) NOT NULL
);
GO

 CREATE TABLE Matriculas (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    Id_Estudiante INT,
    Id_Curso INT,
    Fecha DATE DEFAULT GETDATE(),
    FOREIGN KEY (Id_Estudiante) REFERENCES Estudiantes(Id),
    FOREIGN KEY (Id_Curso) REFERENCES Cursos(Id)
);
GO
