# *OOP - Bomberman - Team4*
***
## 1. Giới thiệu:
Bomberman là một trò chơi kinh điển thuộc loại trò chơi điện tử dạng mê cung.
Với các kiến thức các thầy truyền tải về lập trình hướng đối tượng, Bomberman được đưa vào như một bài tập lớn cho môn học.

![alt text](/res/images/preview/preview.jpg)

![alt text](/res/images/preview/preview1.jpg)


***
## 2. Mô tả
Nếu bạn đã từng chơi Bomberman, bạn sẽ cảm thấy quen thuộc với những đối tượng này. Chúng được được chia làm hai loại chính là nhóm đối tượng động (Bomber, Enemy, Bomb) và nhóm đối tượng tĩnh (Wall, Item, Trap,...).
* Bomber: Nhân vật chính của trò chơi. Bomber có thể di chuyển và đặt bom theo sự điều khiển của người chơi.
Có các nhân vật khác nhau với mỗi bộ chỉ sô riêng biệt:
> ![alt text](/res/images/preview/characters.jpg)


* Monster: Các đối tượng mà Bomber phải tiêu diệt hết để có thể qua Level. Enemy có thể di chuyển ngẫu nhiên hoặc tự đuổi theo Bomber tùy theo loại Enemy.
Giống như Bommer, Monster cũng có nhiều loại:
    * Monster thường: Tấn công nếu bomber đến gần và chúng có máu yếu và tốc độ di chuyển không cao.
  > ![alt text](/res/images/preview/monster1.jpg)
    * Monster cảm tử: Có máu rất lớn, tốc độ di chuyển trung bình, chúng sẽ tìm đến bomber tự phát nổ và chết nếu như bomber tiếp cận.
  > ![alt text](/res/images/preview/monster2.jpg)
    * Monster thông minh: Lượng máu lớn, tốc độ di chuyển cao và rất khó để đoán trước đường đi của chúng.
  > ![alt text](/res/images/preview/monster3.jpg)


* Block: Không cho phép đặt Bomb lên nhưng có thể bị phá hủy bởi Bomb được đặt gần đó. Bomber và Enemy thông thường không thể di chuyển vào vị trí Brick khi nó chưa bị phá hủy.
  > ![alt text](/res/images/preview/block.jpg)


* Item: Vật phẩm được rơi ra sau khi hạ gục Monster / phá huỷ Block với mục đích tăng chỉ số nhân vật khi nhặt nó. Những vật phẩm này sẽ biến mất sau một khoảng thời gian.
  > ![alt text](/res/images/preview/item.png)
Với các chức năng từ trái sang phải là: Tăng HP tối đa, Tăng dame, Hồi máu, Tăng tốc độ di chuyển.


* Wall / Rock / Water là đối tượng cố định, không thể phá hủy bằng Bomb cũng như không thể đặt Bomb lên được, Bomber và Monster không thể di chuyển vào đối tượng này
  > ![alt text](/res/images/preview/title.jpg)


* Trap / Lava: Khi bạn đi qua dung nham, sẽ bị mất máu!
  > ![alt text](/res/images/preview/trap.jpg)


***
## 3. Hướng dẫn:
* Chọn nhân vật: Dùng chuột trái để chọn nhân vật
![alt text](/res/images/preview/character-selection.png)


* Điều khiển nhân vật: Sử dụng các phím mũi tên trái / phải / lên / xuống để điều khiển nhân vật.


* Đặt bom: Sử dụng phím Space để đặt bom.


## Một vài lưu ý khi chơi game:
* Bạn phải tiêu diệt hết quái để qua màn mới.
* Sau khi bom nổ, nó sẽ để lại vụ nổ hình dấu công xung quang, khi bomber tiếp xúc sẽ mất máu.
* Có thể tạm dừng trò chơi.

## Các kiến thức liên quan:
* Thuật toán Dijkstra
* Design Pattern

## Chúc người chơi có trải nghiệm game vui vẻ!

