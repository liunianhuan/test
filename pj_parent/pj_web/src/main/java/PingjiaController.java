import com.alibaba.dubbo.config.annotation.Reference;
import com.pingjia.pojo.User;
import com.pingjia.service.PingJiaService;

import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/user")
public class PingjiaController {
    @Reference
    private PingJiaService pingJiaService;

    @RequestMapping("/findAll")
    public List<User>  findAdd(){
        return pingJiaService.findAll();
    }


    @RequestMapping("/insert")
    public Result insert(@RequestBody  User username){
        try {
            pingJiaService.insert(username);
            return new Result(true, "新增成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "新增失败");
        }
    }
}
