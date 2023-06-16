module my_module_a {
	exports pack1;
	//exports pack2;
	
	//전의 의존 설명 
	requires transitive my_module_b;
}