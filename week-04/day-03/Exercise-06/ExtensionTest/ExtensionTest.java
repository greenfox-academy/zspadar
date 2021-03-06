import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void tetsAdd_1and5is5() {
    assertEquals(6, extension.add(1, 5));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMaxOfThree_second() {
    assertEquals(5, extension.maxOfThree(3, 5, 4));
  }

  @Test
  void testMedian_four() {
    assertEquals(4.5, extension.median(Arrays.asList(7,4,3,5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3.0, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testMedian_three() {
    assertEquals(2.0, extension.median(Arrays.asList(1,2,3)));
  }

  @Test
  void testMedian_seven() {
    assertEquals(1.0, extension.median(Arrays.asList(1,1,1,3,1,1,1)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testIsVowel_U() {
    assertTrue(extension.isVowel('U'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

  @Test
  void testTranslate_ter() {
    assertEquals("leveevesivik", extension.translate("leesik"));
  }


}