package com.test

class test{

static void main(args){
def env = System.getenv();
List<String> taxonomy_list = new ArrayList<>();
String taxonomy_string = env.TAXONOMIES as String;
String[] taxonomy_array = taxonomy_string.split(",");
for( String value : taxonomy_array )
  {
    taxonomy_list.add(value);
  }
 println taxonomy_list;
Integer port = env.PORT as int;
println port;
}

}
