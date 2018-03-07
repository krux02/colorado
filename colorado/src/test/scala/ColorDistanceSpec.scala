package colorado

import org.scalatest._

class ColorDistanceSpec extends AsyncFreeSpec with MustMatchers {
  "CIEDE2000" in {
    import ColorDistance.ciede2000

    def ciede2000_case(l1: Double, a1: Double, b1: Double, l2: Double, a2: Double, b2: Double, de: Double) = {
      ciede2000(l1, a1, b1, l2, a2, b2) mustEqual de +- 0.0001
    }

    // from http://www.ece.rochester.edu/~gsharma/ciede2000/dataNprograms/ciede2000testdata.txt

    ciede2000_case(50.0000, 2.6772, -79.7751, 50.0000, 0.0000, -82.7485, 2.0425)
    ciede2000_case(50.0000, 2.6772, -79.7751, 50.0000, 0.0000, -82.7485, 2.0425)
    ciede2000_case(50.0000, 3.1571, -77.2803, 50.0000, 0.0000, -82.7485, 2.8615)
    ciede2000_case(50.0000, 2.8361, -74.0200, 50.0000, 0.0000, -82.7485, 3.4412)
    ciede2000_case(50.0000, -1.3802, -84.2814, 50.0000, 0.0000, -82.7485, 1.0000)
    ciede2000_case(50.0000, -1.1848, -84.8006, 50.0000, 0.0000, -82.7485, 1.0000)
    ciede2000_case(50.0000, -0.9009, -85.5211, 50.0000, 0.0000, -82.7485, 1.0000)
    ciede2000_case(50.0000, 0.0000, 0.0000, 50.0000, -1.0000, 2.0000, 2.3669)
    ciede2000_case(50.0000, -1.0000, 2.0000, 50.0000, 0.0000, 0.0000, 2.3669)
    ciede2000_case(50.0000, 2.4900, -0.0010, 50.0000, -2.4900, 0.0009, 7.1792)
    ciede2000_case(50.0000, 2.4900, -0.0010, 50.0000, -2.4900, 0.0010, 7.1792)
    ciede2000_case(50.0000, 2.4900, -0.0010, 50.0000, -2.4900, 0.0011, 7.2195)
    ciede2000_case(50.0000, 2.4900, -0.0010, 50.0000, -2.4900, 0.0012, 7.2195)
    ciede2000_case(50.0000, -0.0010, 2.4900, 50.0000, 0.0009, -2.4900, 4.8045)
    ciede2000_case(50.0000, -0.0010, 2.4900, 50.0000, 0.0010, -2.4900, 4.8045)
    ciede2000_case(50.0000, -0.0010, 2.4900, 50.0000, 0.0011, -2.4900, 4.7461)
    ciede2000_case(50.0000, 2.5000, 0.0000, 50.0000, 0.0000, -2.5000, 4.3065)
    ciede2000_case(50.0000, 2.5000, 0.0000, 73.0000, 25.0000, -18.0000, 27.1492)
    ciede2000_case(50.0000, 2.5000, 0.0000, 61.0000, -5.0000, 29.0000, 22.8977)
    ciede2000_case(50.0000, 2.5000, 0.0000, 56.0000, -27.0000, -3.0000, 31.9030)
    ciede2000_case(50.0000, 2.5000, 0.0000, 58.0000, 24.0000, 15.0000, 19.4535)
    ciede2000_case(50.0000, 2.5000, 0.0000, 50.0000, 3.1736, 0.5854, 1.0000)
    ciede2000_case(50.0000, 2.5000, 0.0000, 50.0000, 3.2972, 0.0000, 1.0000)
    ciede2000_case(50.0000, 2.5000, 0.0000, 50.0000, 1.8634, 0.5757, 1.0000)
    ciede2000_case(50.0000, 2.5000, 0.0000, 50.0000, 3.2592, 0.3350, 1.0000)
    ciede2000_case(60.2574, -34.0099, 36.2677, 60.4626, -34.1751, 39.4387, 1.2644)
    ciede2000_case(63.0109, -31.0961, -5.8663, 62.8187, -29.7946, -4.0864, 1.2630)
    ciede2000_case(61.2901, 3.7196, -5.3901, 61.4292, 2.2480, -4.9620, 1.8731)
    ciede2000_case(35.0831, -44.1164, 3.7933, 35.0232, -40.0716, 1.5901, 1.8645)
    ciede2000_case(22.7233, 20.0904, -46.6940, 23.0331, 14.9730, -42.5619, 2.0373)
    ciede2000_case(36.4612, 47.8580, 18.3852, 36.2715, 50.5065, 21.2231, 1.4146)
    ciede2000_case(90.8027, -2.0831, 1.4410, 91.1528, -1.6435, 0.0447, 1.4441)
    ciede2000_case(90.9257, -0.5406, -0.9208, 88.6381, -0.8985, -0.7239, 1.5381)
    ciede2000_case(6.7747, -0.2908, -2.4247, 5.8714, -0.0985, -2.2286, 0.6377)
    ciede2000_case(2.0776, 0.0795, -1.1350, 0.9033, -0.0636, -0.5514, 0.9082)
  }
}