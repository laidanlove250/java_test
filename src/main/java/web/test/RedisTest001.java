/**
 * 
 */
package web.test;

import java.util.Iterator;
import java.util.Set;

import redis.clients.jedis.Jedis;

/**
 * @author Admin
 *
 */
public class RedisTest001 {

	public static void main(String[] args) {
    	//连接本地的 Redis 服务
        Jedis jedis = new Jedis("192.168.1.6");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        // 清空数据库中数据
        jedis.flushDB();
        jedis.set("1", "2");
	}
}
