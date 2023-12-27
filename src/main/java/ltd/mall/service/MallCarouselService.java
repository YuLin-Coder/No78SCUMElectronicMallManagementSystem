package ltd.mall.service;

import ltd.mall.controller.vo.MallIndexCarouselVO;
import ltd.mall.entity.Carousel;
import ltd.mall.util.PageQueryUtil;
import ltd.mall.util.PageResult;

import java.util.List;

public interface MallCarouselService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getCarouselPage(PageQueryUtil pageUtil);

    String saveCarousel(Carousel carousel);

    String updateCarousel(Carousel carousel);

    Carousel getCarouselById(Integer id);

    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回固定数量的轮播图对象(首页调用)
     *
     * @param number
     * @return
     */
    List<MallIndexCarouselVO> getCarouselsForIndex(int number);
}
