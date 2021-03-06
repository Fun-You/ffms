import layoutHeaderAside from '@/layout/header-aside'
// 由于懒加载页面太多的话会造成webpack热更新太慢，所以开发环境不使用懒加载，只有生产环境使用懒加载
const _import = require('@/libs/util.import.' + process.env.NODE_ENV)

const meta = { auth: true }

export default {
  path: '/fund',
  name: 'Fund',
  meta,
  redirect: { name: 'fund-index' },
  component: layoutHeaderAside,
  children: (pre => [
    { path: 'index', name: `${pre}index`, component: _import('fund/index'), meta: { ...meta, title: '持有概况' } },
    { path: 'details', name: `${pre}details`, component: _import('fund/details'), meta: { ...meta, title: '基金详情' } }
    // { path: 'html', name: `${pre}html`, component: _import('demo/frame/html'), meta: { ...meta, title: '静态 HTML' } },
    // { path: 'report', name: `${pre}report`, component: _import('demo/frame/report'), meta: { ...meta, title: 'Size report' } },
    // { path: 'd2-doc', name: `${pre}d2-doc`, component: _import('demo/frame/d2-doc'), meta: { ...meta, title: 'D2Admin 中文文档' } }
  ])('fund-')
}
