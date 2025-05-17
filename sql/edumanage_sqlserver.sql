CREATE DATABASE EduManage_1;
GO

USE EduManage_1;
GO


CREATE TABLE Estudiantes (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    Nombre NVARCHAR(100) NOT NULL,
    Apellido NVARCHAR(100) NOT NULL,
    Correo NVARCHAR(100) NOT NULL UNIQUE,
    Telefono NVARCHAR(20),
    Fecha_Registro DATE DEFAULT GETDATE()
);


CREATE TABLE Cursos (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    Nombre NVARCHAR(100) NOT NULL
);


CREATE TABLE Matriculas (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    Id_Estudiante INT,
    Id_Curso INT,
    Fecha DATE DEFAULT GETDATE(),
    FOREIGN KEY (Id_Estudiante) REFERENCES Estudiantes(Id),
    FOREIGN KEY (Id_Curso) REFERENCES Cursos(Id)
);


CREATE TABLE Profesores (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    Nombre NVARCHAR(100) NOT NULL,
    Especialidad NVARCHAR(100),
    Correo NVARCHAR(100) UNIQUE
);


CREATE TABLE Asignaciones (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    Id_Profesor INT,
    Id_Curso INT,
    FOREIGN KEY (Id_Profesor) REFERENCES Profesores(Id),
    FOREIGN KEY (Id_Curso) REFERENCES Cursos(Id)
);
