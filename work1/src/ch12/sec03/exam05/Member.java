package ch12.sec03.exam05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
 * @Data는 @requiredArgsConstructor, @Getter, @Setter, 
 * @EqualsAngHashCode, @ToString 어노테이션들이 합쳐진것과 동일한 효과를 낸다.
 * 
 */

@Data //어노테이션.
@NoArgsConstructor	// 기본 생성자 포함(매개 변수가 없는)
@AllArgsConstructor	// 모든 필드를 초기화 시키는 생성자 포함. 
public class Member {
	private String id;
	private String name;
	private int age;
}
