let list = document.querySelectorAll(".result")
let num1;
let num2;


document.querySelectorAll(".entry").forEach((value,index) => value.addEventListener("change", ()=>{
    if(index == 0){
        num1 = eval(value.value * 150.95)
        list[index].textContent = (eval(value.value * 150.95)).toFixed(2)
    } else {
        num2 = eval(value.value * 180.95)
        list[index].textContent = (eval(value.value * 180.95)).toFixed(2)
    }
}))


document.querySelector(".total").addEventListener("click", ()=>{
    list[2].textContent = (num1 + num2).toFixed(2)
})

