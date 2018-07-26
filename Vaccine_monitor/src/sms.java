import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class sms {
	public String sms() {
		try {
			// Construct data
			String apiKey = "apikey=" + URLEncoder.encode("wB2BBCf+F74-CRBU6WxSeDDh3UxzsEmgMFa2QRnyYI", "UTF-8");
			String message = "&message=" + URLEncoder.encode("This is your message", "UTF-8");
			String sender = "&sender=" + URLEncoder.encode("TXTLCL", "UTF-8");
			String numbers = "&numbers=" + URLEncoder.encode("8442016892", "UTF-8");
			
			// Send data
			String data = "https://api.txtlocal.com/send/?" + apiKey + numbers + message + sender;
			URL url1 = new URL(data);
			URLConnection conn1 = url1.openConnection();
			conn1.setDoOutput(true);
			
			// Get the response
			BufferedReader rd1 = new BufferedReader(new InputStreamReader(conn1.getInputStream()));
			String line;
			String sResult="";
			while ((line = rd1.readLine()) != null) {
			// Process line...
				sResult=sResult+line+" ";
			}
			rd1.close();
			
			return sResult;
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
			return "Error "+e;
		}
			}
}
