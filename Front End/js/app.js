let studentTable=document.getElementById("tbl-student");

fetch("http://localhost:8080/get-students")
.then(response =>response.json())
.then(res =>{
    let tblBody=`    <tr>
    <td>Student Id</td>
    <td>Name</td>
    <td>Age</td>
    <td>Address</td>
    <td>Grade</td>
</tr>`
res.forEach(element => {
   tblBody+=`    <tr>
   <td>${element.id}</td>
   <td>${element.name}</td>
   <td>${element.age}</td>
   <td>${element.address}</td>
   <td>${element.grade}</td>
</tr>` ;
});
studentTable.innerHTML=tblBody;
})