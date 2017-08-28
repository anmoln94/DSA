/* Create a hashmap with key as the hashcode(unique to each url) and value as the original url.
 * For encoding: append the hashcode to the end of "http://tinyurl.com/
 * For decoding: Strip the hashcode the tiny url, find the url corresponding to this hashcode in the map.
*/
public class Codec {
    Map<Integer, String> map = new HashMap<>();
    public String encode(String longUrl) {
        map.put(longUrl.hashCode(),longUrl);
        return "http://tinyurl.com/"+longUrl.hashCode();
    }
    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
    }
}