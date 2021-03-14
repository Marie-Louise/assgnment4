fun main() {
campus()

    println (teacher("Marie",20));
    println(length("marie louise"));
    my_name("marie")

}
fun campus(){
    var name="akirachix"
    print(name[0])
    print(name[2])
    println(name[3])


    }
fun teacher(x: String,y:Int):String{
    return "Hi,my name is $x I am $y years old"
}
fun length(x: String):Int{
    return x.length
}
fun my_name(name:String){
    if(name=="marie"){
        println("that's me")
    }
    else{
        println("i don't know who is that")
    }
}