const express = require("express");
const router = new express.Router();
const studentsControllers = require("../Controllers/StudentController");
//#region  For Students
//Get All Students
router.get("/",studentsControllers.GetAllStudents)
//Get Student By ID
router.get("/:id",studentsControllers.GetStudentByID)
//Create New Student
router.post("/",studentsControllers.AddNewStudent)
//Update Student
router.put("/:id",studentsControllers.UpdateStudent)
//Delete Student
router.delete("/:id",studentsControllers.DeleteStudentByID)
//#endregion

module.exports = router;
