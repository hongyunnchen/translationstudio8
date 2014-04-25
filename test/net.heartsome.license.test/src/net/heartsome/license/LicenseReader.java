package net.heartsome.license;

import net.heartsome.license.utils.FileUtils;

public class LicenseReader {
	private int productId;
	private byte[] key = new byte[] {48,-126,4,-67,2,1,0,48,13,6,9,42,-122,72,-122,-9,13,1,1,1,5,0,4,-126,4,-89,48,-126,4,-93,2,1,0,2,
			-126,1,1,0,-116,-31,33,-26,26,115,95,-111,-97,62,29,91,-68,-26,19,56,-16,16,115,-127,-120,-58,-20,-52,-2,56,23,-2,-68,
			43,-20,-53,61,16,-10,35,-66,-5,-6,-69,-61,109,69,-26,74,-103,124,-34,-117,-28,-19,93,105,-47,-15,-27,-115,-41,-69,10,
			20,51,-54,70,-93,108,28,85,87,-120,95,-59,-30,-44,-117,8,82,104,39,-71,53,61,50,92,15,-64,-40,121,-55,21,10,86,34,21,
			82,69,-69,25,86,6,-105,19,-86,-86,80,109,-55,19,-81,44,-18,-114,-125,-79,-26,-83,29,90,-127,-3,-100,-86,-4,-72,34,-66,
			-71,15,28,-62,93,-3,-119,-73,115,-22,-107,-90,80,-102,-41,24,3,1,-107,-26,55,-83,113,69,-47,-115,-93,7,8,70,28,-38,112,
			95,-44,98,-55,51,-79,-49,-83,4,112,-6,-102,30,-86,60,-121,29,-81,-126,31,-23,-90,108,-119,94,-28,15,-22,-16,91,42,37,
			-90,-43,119,120,73,105,-2,31,-64,-85,94,-101,43,-87,-6,-97,19,35,-124,53,-95,-113,94,-101,-113,-18,-52,-93,92,122,-108,
			73,95,85,116,45,29,-118,20,52,-41,114,73,31,-114,-15,71,-44,-38,-91,-48,72,-54,-49,48,-118,79,98,-47,-34,37,-67,95,-81,
			-67,2,3,1,0,1,2,-126,1,0,101,-115,-23,12,-31,-26,103,111,39,22,-12,-68,-21,-40,2,-27,89,-112,-46,98,-1,65,62,-12,-85,17,
			-82,-94,111,-19,78,30,88,32,0,-1,85,-82,121,89,-97,16,7,-126,114,38,96,-16,96,114,31,117,-26,81,116,-119,-31,13,49,-124,
			-101,121,-106,8,3,-56,108,72,76,-8,62,-23,-4,-112,-16,-60,-121,-5,19,31,-100,-76,71,-72,59,-106,-19,-74,36,-15,40,-23,
			92,90,120,91,81,-5,122,-102,-9,-113,50,-56,-31,127,-78,-94,-96,-11,-57,-26,46,35,49,65,123,-42,-127,-68,91,-110,-102,
			-24,-10,10,-4,-123,66,-99,-7,83,56,118,27,-96,37,-64,107,120,-81,-29,87,112,-8,121,10,-93,121,-93,54,49,84,-46,-16,-69,
			110,93,113,31,35,-22,-120,-121,-31,-31,17,-73,44,-31,73,114,106,7,-88,-63,48,34,43,-16,-128,-96,-24,-109,-116,92,25,39,
			40,127,4,33,-26,84,-117,72,0,110,112,-6,94,23,85,115,-67,118,80,108,-110,-20,-90,-73,-27,31,-96,-115,-75,113,-29,-117,
			-57,-34,3,-92,124,-8,-20,-53,31,27,-88,69,-122,-103,38,42,-15,-110,-14,3,-105,50,-26,38,-14,-44,122,88,-108,70,46,88,
			-36,-75,73,-127,2,-127,-127,0,-19,-64,20,102,-53,-80,29,97,-12,68,10,-77,-84,-29,19,63,-77,3,-120,69,-38,80,-49,-52,
			33,-9,25,-81,43,65,119,-40,-37,-76,5,-71,-57,26,-99,-64,41,40,38,124,-102,-60,-39,-121,32,-75,-104,12,95,-62,47,27,8,
			29,68,14,-44,-78,-30,-109,-37,-41,-23,-109,-74,119,109,83,71,63,-62,-32,-126,32,103,-57,101,-95,123,6,-7,13,106,47,41,
			-102,-121,122,-28,8,49,34,-90,14,-59,-47,57,-104,124,-92,115,-78,48,-103,40,-90,79,-3,66,-123,-110,99,-128,12,-5,-58,
			110,105,76,-116,-126,-91,1,-31,2,-127,-127,0,-105,-79,124,-8,1,95,35,99,-57,-45,-65,44,-53,93,-18,-17,-4,1,-57,16,-46,
			-115,-4,86,-19,96,-125,7,-82,98,47,38,-94,-53,-20,-45,37,86,-65,108,-57,2,108,40,31,-55,-38,-16,86,67,66,-16,104,30,
			108,9,70,-26,-123,-105,-120,-106,-50,-117,31,-101,74,32,103,126,32,-83,-40,-27,-90,-22,-55,-48,124,5,-28,65,65,-102,
			-52,-93,65,-65,17,112,-71,29,90,-24,-68,-84,73,-119,109,-52,-25,33,-33,-73,-85,61,78,-47,106,7,-65,43,8,87,22,78,96,
			-101,85,50,-52,72,-102,-9,-88,48,33,93,2,-127,-128,25,-99,-119,85,45,-6,-14,-97,124,38,-36,-108,81,59,65,-10,-87,-3,
			-26,111,-56,62,-50,-76,-86,-80,41,-41,66,-84,-46,17,-50,82,14,15,-33,16,-46,16,67,30,-19,78,-99,-118,57,-7,-94,31,
			-114,-101,62,-79,-8,75,76,75,-126,-22,-86,37,-1,-35,120,97,65,-20,69,75,-122,-66,-29,61,78,108,-53,-8,91,-42,18,-16,
			28,6,59,77,35,-76,-93,33,-32,24,-16,122,-91,120,-101,53,-102,64,-103,-103,1,76,-30,-98,63,56,49,54,2,6,66,101,-117,
			-55,38,-95,-65,122,-72,-88,-91,-77,-71,-37,-73,97,2,-127,-127,0,-109,97,-108,-93,120,-31,-80,-122,-81,-115,-95,126,
			-86,16,23,-89,-2,-42,-45,76,26,-26,108,-73,32,102,-42,-89,-51,-36,3,39,-84,-96,40,-10,116,-98,-75,-39,-65,-7,48,-112,
			67,98,97,95,-124,-48,80,-25,54,-95,-24,33,-109,75,65,-100,-102,-50,-70,-38,28,-39,73,-55,-10,3,107,72,-67,37,83,105,
			102,-81,50,-16,-98,118,112,-127,48,53,-90,25,55,-98,-89,-100,71,-55,60,22,-64,83,-49,-28,118,-28,72,114,48,-29,-98,
			2,-124,-36,5,-10,-113,97,-35,-128,69,8,102,92,-74,114,12,110,118,112,92,-39,2,-127,-128,18,114,-71,-94,26,-65,-63,
			87,-42,-61,44,-36,80,-63,97,127,40,-99,-67,-9,86,68,16,12,101,-71,75,-41,43,-15,54,119,-26,-126,-16,68,16,99,16,
			22,-83,4,127,126,62,-52,42,-10,-30,-62,-9,-71,-41,-109,-22,98,-69,56,-53,-12,107,-66,106,22,19,-124,122,-74,106,
			-126,-39,-27,-37,-22,-67,41,-56,-75,118,120,50,-41,-2,19,83,-48,-53,0,-69,95,-4,18,46,81,116,121,-70,124,-14,68,
			-47,-35,-86,56,-34,124,27,-37,-80,56,65,-26,-17,89,121,29,-72,112,-96,98,-115,59,7,76,62,68,-73,-71};

	public LicenseReader(int productId) {
		this.productId = productId;
	}
	
	public String getLicenseInfo() {
		byte[] b = FileUtils.readFile(ProtectionFactory.getFileName(1, productId));
		if (b == null) {
			return null;
		}
		try {
			b = ProtectionFactory.getEncrypt().decrypt(key, b);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return new String(b);
	}

}