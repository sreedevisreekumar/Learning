using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OnlineShoppingStore.Domain.Abstract;
namespace OnlineShoppingStore.Domain.Concrete
{
  public class EFProductRepository:IProductRepository
    {
      private readonly EFDbContext context = new EFDbContext();
      public IEnumerable<Entities.Product>Products
      {
          get
          {
              return context.Products;
          }
      }
    }
}
