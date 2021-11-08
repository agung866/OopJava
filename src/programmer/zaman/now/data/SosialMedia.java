package programmer.zaman.now.data;

class SosialMedia {

}
class Facebook extends SosialMedia{
 //final class tdk dapat di turunkan lagi
 void login(String username, String password){
     //final mthode tdk bisa di override di clas turunannya
 }
}

class FakeFaceBook extends Facebook{

}

