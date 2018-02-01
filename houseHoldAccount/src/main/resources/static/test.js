$("#hello").click(
	function(){
		$.ajax({
			type:"get",
			url:"./rs/test",
			success:function(response){
				alert(response);
			},
			error:function(request,status,thrown){
				alert("error");
			},
		});
	}
);

$("#helloB").click(
	function(){
		let json = 
			{
				'name':'ko',
				'age':25
			};

		$.ajax({
			type:"put",
			url:"./rs/test",
			contentType:"application/json",
			datatype:"json",
			data : JSON.stringify(json),
			success:function(response){
				console.log(response);
			},
			error:function(request,status,thrown){
				console.log(request);
				console.log(status);
				console.log(thrown);
			},
		});
	}
);