package base;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PageObjectPool {

    private static final Logger logger = Logger.getLogger(PageObjectPool.class.getName());

    private static final ConcurrentMap<String, Object> pageObjectMap = new ConcurrentHashMap<>();

    public static <T> T getPage(String pageName, Class<T> pageClass){
        Object object;
        if(!pageObjectMap.containsKey(pageName)){
            try {
                object =  pageClass.getDeclaredConstructor().newInstance();
                pageObjectMap.put(pageName, object);
                logger.info("Creating a new instance for class " + pageClass.getName() + " : " + object.hashCode());
            }catch (Exception e){
                logger.log(Level.WARNING, "Exception while creating instance of given class : " + e.getMessage(), e);
                logger.warning("Warning: Not able to get object for class " + pageClass.getName());
            }
        }else{

            object = pageObjectMap.get(pageName);
            logger.info("Re-using the object for class " + pageClass.getName() + " : " + object.hashCode());
        }
        return pageClass.cast(pageObjectMap.get(pageName));
    }
}
