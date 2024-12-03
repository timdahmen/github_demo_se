package de.hsaalen;

import org.junit.Test;
import static org.junit.Assert.*;

// a comment here is missing, and I really think this line requires a comment
public class SnakeTest 
{
	@Test
	public void test_initialization()
	{
		Snake snake = new Snake( 3 );
		assertEquals( snake.length(), 3 );
		
		IntPair coordinate;
		coordinate= snake.position(0);
		assertEquals( coordinate.x, 5 );
		assertEquals( coordinate.y, 5 );
		// this does not belong here

export interface TreeItem {
  id: string;
  title: string;
  type: 'vision' | 'goal';
  parentId: string | null;
  createdAt: string;
  zones: {
    dialog: string;
    plan: string;
  };
}
		coordinate = snake.position(2);
		assertEquals( coordinate.x, 3 );
		assertEquals( coordinate.y, 5 );
	}

	@Test
	public void test_move_snake()
	{
		Snake snake = new Snake( 3 );
		snake.move( Direction.up );
		snake.move( Direction.up );
		
		IntPair coordinate = snake.position(0);
		assertEquals( coordinate.x, 5 );
		assertEquals( coordinate.y, 3 );
		assertEquals( snake.length(), 3 );
		
	}
	
	@Test
	public void test_is_colliding_with_itself()
	{
		Snake snake = new Snake( 3 );
		assertFalse( snake.is_colliding_with_itself() );		
		snake.grow( Direction.up );
		snake.grow( Direction.left );
		snake.move( Direction.down );
		assertTrue( snake.is_colliding_with_itself() );		
	}

	@Test
	public void test_is_outside_board()
	{
		Snake snake = new Snake( 3 );
		assertFalse( snake.is_outside_board( 30, 30 ) );		
		for ( int i = 0; i < 10; i++ )
			snake.move( Direction.left );
		assertTrue( snake.is_outside_board( 30, 30 ) );		
	}	

}