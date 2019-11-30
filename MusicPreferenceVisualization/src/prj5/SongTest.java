/**
 * 
 */
package prj5;

import student.TestCase;

/**
 * @author smksu
 *
 */
public class SongTest extends TestCase
{
    private Song song1;
    
    public void setUp()
    {
        song1 = new Song("Santa", "Christmas Carols", 2019, "Christmas");
    }
    
    public void testGetArtist()
    {
        assertEquals("Santa", song1.getArtist());
    }
    
    public void testGetSongTitle()
    {
        assertEquals("Christmas Carols", song1.getSongTitle());
    }
    
    public void testGetYear()
    {
        assertEquals(2019, song1.getYear());
    }
    
    public void testGetGenre()
    {
        assertEquals("Christmas", song1.getGenre());
    }
}
