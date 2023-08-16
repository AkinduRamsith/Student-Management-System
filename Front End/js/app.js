
let id = document.querySelector(".studentid");
let name = document.querySelector(".studentName");
let age = document.querySelector(".studentAge");
let address = document.querySelector(".studentAddress");
let grade = document.querySelector(".studentGrade");


let studentTable = document.getElementById("tbl-student");
let btnAkindu = document.getElementById("btn-akindu");

btnAkindu.addEventListener("click", () => {
    fetch("http://localhost:8080/get-students/akindu")
        .then(response => response.json())
        .then(res => {
            res.forEach(element => {
                console.log(element.id);
                id.textContent = element.id;
                name.textContent = element.name;
                age.textContent = element.age;
                address.textContent = element.address;
                grade.textContent = element.grade;
            

            });
            studentTable.innerHTML=id;
        })
        .catch(error => {
            console.error("Error fetching data:", error);
        });
});


// fetch("http://localhost:8080/get-students")
// .then(response =>response.json())
// .then(res =>{
//     let tblBody=`    <tr>
//     <td>Student Id</td>
//     <td>Name</td>
//     <td>Age</td>
//     <td>Address</td>
//     <td>Grade</td>
// </tr>`
// res.forEach(element => {
//    tblBody+=`    <tr>
//    <td>${element.id}</td>
//    <td>${element.name}</td>
//    <td>${element.age}</td>
//    <td>${element.address}</td>
//    <td>${element.grade}</td>
// </tr>` ;
// });
// studentTable.innerHTML=tblBody;
// })