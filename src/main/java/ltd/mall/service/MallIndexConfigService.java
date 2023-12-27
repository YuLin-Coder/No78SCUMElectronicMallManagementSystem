
package ltd.mall.service;

import ltd.mall.controller.vo.MallIndexConfigGoodsVO;
import ltd.mall.entity.IndexConfig;
import ltd.mall.util.PageQueryUtil;
import ltd.mall.util.PageResult;

import java.util.List;

public interface MallIndexConfigService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getConfigsPage(PageQueryUtil pageUtil);

    String saveIndexConfig(IndexConfig indexConfig);

    String updateIndexConfig(IndexConfig indexConfig);

    IndexConfig getIndexConfigById(Long id);

    /**
     * 返回固定数量的首页配置商品对象(首页调用)
     *
     * @param number
     * @return
     */
    List<MallIndexConfigGoodsVO> getConfigGoodsesForIndex(int configType, int number);

    Boolean deleteBatch(Long[] ids);
}
