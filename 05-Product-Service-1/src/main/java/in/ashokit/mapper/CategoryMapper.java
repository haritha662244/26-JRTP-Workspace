
package in.ashokit.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import in.ashokit.dto.CategoryDto;
import in.ashokit.entity.Category;


@Component
public class CategoryMapper {

	private static final ModelMapper mapper = new ModelMapper();

	public static CategoryDto convertToDto(Category category) {
		return mapper.map(category, CategoryDto.class);
	}

	public static Category convertToEntity(CategoryDto categoryDto) {
		return mapper.map(categoryDto, Category.class);
	}
}



//@Component
//public class CategoryMapper {
//
//	private static final ModelMapper mapper = new ModelMapper();
//
//	//this method  is used to covert into entity object
//	public static CategoryDto convertToDto(Category category) {
//		return mapper.map(category, CategoryDto.class);
//	}
//
//	public static Category convertToEntity(CategoryDto categoryDto) {
//		return mapper.map(categoryDto, Category.class);
//	}
//}
//
////mappers are used to convert the data  from one class object data in to another class object data.
////are used to convert the data.
//// dto object in to convert entity.  entity convert into dto  by using model mapper.