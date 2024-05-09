var DatatablesAdvancedColumnVisibility={
		init:function(){
			$("#m_table_1, #m_table_2").DataTable(
					{
						responsive:!0,columnDefs:[
							{targets:[0,1,2],visible:!1},
							{
								targets:-1,
								title:"Actions",
								orderable:!1,
								render:
									function(a,e,t){
										return'\n <span class="dropdown">\n'+
										'<a href="#" class="btn m-btn m-btn--hover-brand m-btn--icon m-btn--icon-only m-btn--pill" data-toggle="dropdown" aria-expanded="true">\n '+
										'<i class="la la-ellipsis-h"></i>\n '+
										'</a>\n'+
										'<div class="dropdown-menu dropdown-menu-right">\n '+
										'<a class="dropdown-item" href="'+t[1]+'/'+t[0]+'"><i class="la la-edit"></i> Edit Detail</a>\n '+
								    	'<a class="dropdown-item" href="'+t[2]+'/'+t[0]+'"><i class="la la-leaf"></i> Delete Detail</a>\n '+										
										'</div>\n'+
										'</span>\n'
//										'<a href="#" class="m-portlet__nav-link btn m-btn m-btn--hover-brand m-btn--icon m-btn--icon-only m-btn--pill" title="View"><i class="la la-edit"></i></a>'
									}
							}
						]
				}
			)
		}
};

jQuery(document).ready(function(){DatatablesAdvancedColumnVisibility.init()});