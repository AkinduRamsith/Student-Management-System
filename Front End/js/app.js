
const id = document.querySelector(".studentid");
const name = document.querySelector(".studentName");
const age = document.querySelector(".studentAge");
const address = document.querySelector(".studentAddress");
const grade = document.querySelector(".studentGrade");
const studentTable = document.getElementById("tbl-student");
const btnAkindu = document.querySelectorAll(".btn-akindu");

let data = null;

const getData = (name) =>{
     let fed = fetch(`http://localhost:8080/get-students/${name}`).then(response => response.json())
     return fed;
};

let prevN = "";
let ob = null;
btnAkindu.forEach((btn) => {
btn.addEventListener("click", (e) => {
    let atr=e.target.getAttribute('data-student-name');
    if(prevN == atr){
        ob = (data === null ? data = getData(atr) : data)
    }else{
        ob = getData(atr);
    }     
        ob.then(res => {
            res.forEach(element => {
                id.textContent = element['id'];
                name.textContent = element['name'];
                age.textContent = element['age'];
                address.textContent = element['address'];
                grade.textContent = element['grade'];
            });   
        }) 
});
})


