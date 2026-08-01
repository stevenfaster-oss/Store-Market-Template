package ir.yaghotcod.test2

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlin.random.Random

@Composable
fun HomePage(navControll: NavHostController) {

    val headline by remember {
        mutableStateOf(
            listOf(
                "Monthly auction", "Accessories ", "Buy 2 + 1", "Social Media"
            )
        )
    }
    val description by remember {
        mutableStateOf(
            listOf(
                "One week at last year's price",
                "Every thing you need ",
                "absolutely real",
                "Follow us on social media"
            )
        )
    }
    val date by remember {
        mutableStateOf(
            listOf("May 1 to 7", "June 20 to 27", "july 10 to 15", "@Store_Market")
        )
    }
    val populer = listOf(
        "All",
        "Digital",
        "clothing and Fashion",
        "Gold and Silver",
        "Cosmetics",
        "Foodstuffs"
    )
    val category_up = listOf("Mobile", "Digital", "Electric", "clothing", "Foodstuffs", "Fashion")
    val category_Down =
        listOf("Laptop", "For kitchen", "Cosmetics", "Gold", "Accessories", "entertainment")
    val image =
        listOf(R.drawable.mobile_ads, R.drawable.picture, R.drawable.chps_ads, R.drawable.picture)
    var selected by remember { mutableStateOf(listOf(true, false, false, false, false)) }
    var index by remember { mutableStateOf(0) }
    var text by remember { mutableStateOf(TextFieldValue("")) }
    val statePager = rememberPagerState(initialPage = 1) { 4 }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            for (i in 1..4) {

                Card(
                    modifier = Modifier.padding(5.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(5.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.linux),
                            null,
                            modifier = Modifier.size(70.dp)
                        )
                    }
                }


            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .shadow(
                    elevation = 4.dp,
                    shape = RoundedCornerShape(12.dp),
                    spotColor = Color(0x40000000)
                ), shape = RoundedCornerShape(12.dp), colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "جستجو",
                    tint = Color(0xFF9E9E9E),
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                BasicTextField(
                    value = text,
                    onValueChange = { text = it },
                    modifier = Modifier.weight(1f),
                    textStyle = TextStyle(
                        fontSize = 14.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Start
                    ),
                    decorationBox = { innerTextField ->
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            if (text.text.isEmpty()) {
                                Text(
                                    text = "Search In Market",
                                    fontSize = 14.sp,
                                    color = Color(0xFF9E9E9E)
                                )
                            }
                            innerTextField()
                        }
                    })
            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        ScrollableTabRow(
            index, containerColor = Color.Transparent
        ) {
            Tab(
                selected = selected[0],
                onClick = {
                    selected = listOf(true, false, false, false, false)
                    index = 0
                },
                text = { Text("All") },
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.LightGray,

                )
            Tab(
                selected = selected[1],
                onClick = {
                    selected = listOf(false, true, false, false, false)
                    index = 1
                },
                text = { Text("Sport") },
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.LightGray
            )
            Tab(
                selected = selected[2],
                onClick = {
                    selected = listOf(false, false, true, false, false)
                    index = 2
                },
                text = { Text("Accessories") },
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.LightGray
            )
            Tab(
                selected = selected[3],
                onClick = {
                    selected = listOf(false, false, false, true, false)
                    index = 3
                },
                text = { Text("Technology") },
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.LightGray
            )
            Tab(
                selected = selected[4],
                onClick = {
                    selected = listOf(false, false, false, false, true)
                    index = 4
                },
                text = { Text("baby sesame") },
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.LightGray
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        HorizontalPager(state = statePager) {

            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(image[it]),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(RoundedCornerShape(15.dp))
                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = headline[it],
                        color = Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = description[it],
                        color = Color.White,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(top = 8.dp)
                    )

                    Text(
                        text = date[it],
                        color = Color.White,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 4.dp)
                    )

                    Button(
                        onClick = { /* اقدام مورد نظر */ },
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .size(width = 100.dp, height = 40.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White, contentColor = Color.Black
                        ),
                        shape = RoundedCornerShape(30.dp)
                    ) {
                        Text(
                            text = "Tell me", fontSize = 10.sp, fontWeight = FontWeight.Medium
                        )
                    }

                }
            }
        }

        pagerIndicators(statePager.currentPage, statePager.pageCount)

        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 10.dp)
                .background(Color(0xFFD32F2F))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 5.dp, vertical = 15.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = "جستجو",
                    tint = Color.White,
                    modifier = Modifier.size(35.dp)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    "Discount",
                    fontSize = 26.sp,
                    color = Color.White
                )

                Spacer(modifier = Modifier.width(20.dp))

                Box(
                    modifier = Modifier
                        .padding(3.dp)
                        .size(30.dp)
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text("23", fontSize = 20.sp)
                }

                Text(
                    ":",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )

                Box(
                    modifier = Modifier
                        .padding(3.dp)
                        .size(30.dp)
                        .background(color = Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    Text("59", fontSize = 20.sp)
                }

                Text(
                    ":",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )

                Box(
                    modifier = Modifier
                        .padding(3.dp)
                        .size(30.dp)
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text("59", fontSize = 20.sp)
                }

                Spacer(modifier = Modifier.width(25.dp))

                Text(
                    "All >",
                    fontSize = 15.sp,
                    color = Color.White
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 15.dp, start = 5.dp)
                    .horizontalScroll(rememberScrollState()),
                verticalAlignment = Alignment.CenterVertically
            ) {
                for (i in 1..10) {
                    val randomNumber = remember { Random.nextInt(20, 60) }
                    Card(
                        modifier = Modifier
                            .padding(5.dp)
                            .width(170.dp)
                            .clickable(
                                enabled = true,
                                onClick = {
                                    navControll.navigate(Navigatae.Digi.route)
                                }),
                        colors = CardDefaults.cardColors(Color.White),
                        elevation = CardDefaults.cardElevation(5.dp),
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = 5.dp, vertical = 15.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.linux),
                                null,
                                modifier = Modifier
                                    .padding(10.dp)
                            )
                            Text("Linux Logo Sticker", modifier = Modifier.padding(vertical = 5.dp))
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text("$250", modifier = Modifier.weight(0.5f))
                                Box(
                                    modifier = Modifier
                                        .padding(5.dp)
                                        .width(40.dp)
                                        .background(
                                            color = Color.Red,
                                            shape = RoundedCornerShape(5.dp)
                                        ),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text("%${randomNumber}", color = Color.White)
                                }
                            }
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(25.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 5.dp)
        ) {
            Text("Categories", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 10.dp)
                .horizontalScroll(rememberScrollState()),
        ) {
            for (index in 0..5) {
                Column(
                    modifier = Modifier
                        .padding(vertical = 5.dp, horizontal = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.linux),
                        null,
                        modifier = Modifier
                            .size(70.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(category_up[index], maxLines = 2)

                    Spacer(modifier = Modifier.height(20.dp))

                    Image(
                        painter = painterResource(R.drawable.linux),
                        null,
                        modifier = Modifier
                            .size(70.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(category_Down[index], maxLines = 2)
                }
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.chps_ads),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 0.dp)
                    .clip(RoundedCornerShape(bottomStart = 15.dp, topStart = 15.dp))
            )

            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    modifier = Modifier
                        .width(200.dp)
                        .padding(10.dp),
                    text = "Linar Chips Your Luck for Good Dating",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.End,
                )

                Button(
                    onClick = { /* اقدام مورد نظر */ },
                    modifier = Modifier
                        .size(width = 120.dp, height = 40.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White, contentColor = Color.Black
                    ),
                    shape = RoundedCornerShape(bottomStart = 10.dp, topStart = 10.dp)
                ) {
                    Text(
                        text = " Buy ", fontSize = 14.sp, fontWeight = FontWeight.Medium
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        cardListHorizontal("Guard and Mobile Cover", R.drawable.mobile)

        HorizontalDivider(
            modifier = Modifier
                .padding(vertical = 15.dp),
            thickness = 7.dp,
            color = Color(0x33C8C8C8)
        )

        cardListHorizontal("Vitamins and minerals", R.drawable.vitamins_and_minerals)

        Spacer(modifier = Modifier.height(10.dp))

        cardListHorizontal("Mobile phone", R.drawable.guard_and_cover_mobile)

        HorizontalDivider(
            modifier = Modifier
                .padding(vertical = 15.dp),
            thickness = 7.dp,
            color = Color(0x33C8C8C8)
        )

        cardListHorizontal("Headphones, headsets and hands-free", R.drawable.airpods)

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.mobile_ads),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 5.dp, bottom = 5.dp, start = 0.dp, end = 10.dp)
                    .clip(RoundedCornerShape(bottomEnd = 15.dp, topEnd = 15.dp))
            )

            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    modifier = Modifier
                        .width(200.dp)
                        .padding(10.dp),
                    text = "Poco X3 Coming in Store",
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start
                )

                Button(
                    onClick = { /* اقدام مورد نظر */ },
                    modifier = Modifier
                        .size(width = 120.dp, height = 40.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White, contentColor = Color.Black
                    ),
                    shape = RoundedCornerShape(bottomEnd = 10.dp, topEnd = 10.dp)
                ) {
                    Text(
                        text = "Buy Now", fontSize = 14.sp, fontWeight = FontWeight.Medium
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        cardListHorizontal("Novel, fiction and drama book", R.drawable.linux)

        HorizontalDivider(
            modifier = Modifier
                .padding(vertical = 15.dp),
            thickness = 7.dp,
            color = Color(0x33C8C8C8)
        )

        Spacer(modifier = Modifier.height(15.dp))

        cardListHorizontal("Car accessories", R.drawable.linux)

        Spacer(modifier = Modifier.height(10.dp))

        cardListHorizontal("Travel and camping accessories", R.drawable.linux)

        HorizontalDivider(
            modifier = Modifier
                .padding(vertical = 15.dp),
            thickness = 7.dp,
            color = Color(0x33C8C8C8)
        )

        cardListHorizontal("Skin and face creams", R.drawable.linux)

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 5.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = null,
                tint = Color(0xFFEC407A),
                modifier = Modifier.size(30.dp)
            )

            Text(
                "The most popular",
                modifier = Modifier.padding(start = 10.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(5.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            for (item in populer) {

                Spacer(modifier = Modifier.width(8.dp))

                Box(
                    modifier = Modifier
                        .border(0.5.dp, Color.LightGray, shape = RoundedCornerShape(30.dp))
                        .background(Color.White, shape = RoundedCornerShape(30.dp))
                        .padding(horizontal = 10.dp, vertical = 5.dp)

                ) {
                    Text(item, modifier = Modifier.padding(5.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            for (i in 1..5) {

                Column(
                    modifier = Modifier
                        .padding(5.dp)
                ) {

                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(400.dp)
                            .padding(vertical = 10.dp, horizontal = 5.dp),
                        colors = CardDefaults.cardColors(Color.White),
                        elevation = CardDefaults.cardElevation(3.dp),
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.linux),
                                contentDescription = null,
                                modifier = Modifier
                                    .background(
                                        Color.LightGray,
                                        shape = RoundedCornerShape(
                                            topStart = 10.dp,
                                            bottomStart = 10.dp
                                        )
                                    )
                            )

                            Spacer(modifier = Modifier.width(10.dp))

                            Box(
                                modifier = Modifier
                                    .size(30.dp)
                                    .background(color = Color.Red, shape = CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("1", color = Color.White)
                            }

                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 5.dp, vertical = 15.dp),
                                text = "Linux Sticker | For Laptop Or Phone .... ",
                                color = Color.Black,
                                fontSize = 15.sp,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis,
                                textAlign = TextAlign.Start
                            )
                        }
                    }

                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(400.dp)
                            .padding(vertical = 10.dp, horizontal = 5.dp),
                        colors = CardDefaults.cardColors(Color.White),
                        elevation = CardDefaults.cardElevation(3.dp),
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.linux),
                                contentDescription = null,
                                modifier = Modifier
                                    .background(
                                        Color.LightGray,
                                        shape = RoundedCornerShape(
                                            topStart = 10.dp,
                                            bottomStart = 10.dp
                                        )
                                    )
                            )

                            Spacer(modifier = Modifier.width(10.dp))

                            Box(
                                modifier = Modifier
                                    .size(30.dp)
                                    .background(color = Color.Red, shape = CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("2", color = Color.White)
                            }

                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 5.dp, vertical = 15.dp),
                                text = "Linux Sticker | For Laptop Or Phone .... ",
                                color = Color.Black,
                                fontSize = 15.sp,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis,
                                textAlign = TextAlign.Start
                            )
                        }
                    }

                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(400.dp)
                            .padding(vertical = 10.dp, horizontal = 5.dp),
                        colors = CardDefaults.cardColors(Color.White),
                        elevation = CardDefaults.cardElevation(3.dp),
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.linux),
                                contentDescription = null,
                                modifier = Modifier
                                    .background(
                                        Color.LightGray,
                                        shape = RoundedCornerShape(
                                            topStart = 10.dp,
                                            bottomStart = 10.dp
                                        )
                                    )
                            )

                            Spacer(modifier = Modifier.width(10.dp))

                            Box(
                                modifier = Modifier
                                    .size(30.dp)
                                    .background(color = Color.Red, shape = CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("3", color = Color.White)
                            }

                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 5.dp, vertical = 15.dp),
                                text = "Linux Sticker | For Laptop Or Phone .... ",
                                color = Color.Black,
                                fontSize = 15.sp,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis,
                                textAlign = TextAlign.Start
                            )
                        }
                    }

                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        HorizontalDivider(
            modifier = Modifier
                .padding(vertical = 15.dp),
            thickness = 7.dp,
            color = Color(0x33C8C8C8)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 5.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = null,
                tint = Color(0xFFB71C1C),
                modifier = Modifier.size(30.dp)
            )

            Text(
                "Hottest in the last few hours",
                modifier = Modifier.padding(start = 10.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(5.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            for (i in 1..5) {

                Column(
                    modifier = Modifier
                        .padding(5.dp)
                ) {

                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(400.dp)
                            .padding(vertical = 10.dp, horizontal = 5.dp),
                        colors = CardDefaults.cardColors(Color.White),
                        elevation = CardDefaults.cardElevation(3.dp),
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.linux),
                                contentDescription = null,
                                modifier = Modifier
                                    .background(
                                        Color.LightGray,
                                        shape = RoundedCornerShape(
                                            topStart = 10.dp,
                                            bottomStart = 10.dp
                                        )
                                    )
                            )

                            Spacer(modifier = Modifier.width(10.dp))

                            Box(
                                modifier = Modifier
                                    .size(30.dp)
                                    .background(color = Color.Red, shape = CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("1", color = Color.White)
                            }

                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 5.dp, vertical = 15.dp),
                                text = "Linux Sticker | For Laptop Or Phone .... ",
                                color = Color.Black,
                                fontSize = 15.sp,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis,
                                textAlign = TextAlign.Start
                            )
                        }
                    }

                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(400.dp)
                            .padding(vertical = 10.dp, horizontal = 5.dp),
                        colors = CardDefaults.cardColors(Color.White),
                        elevation = CardDefaults.cardElevation(3.dp),
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.linux),
                                contentDescription = null,
                                modifier = Modifier
                                    .background(
                                        Color.LightGray,
                                        shape = RoundedCornerShape(
                                            topStart = 10.dp,
                                            bottomStart = 10.dp
                                        )
                                    )
                            )

                            Spacer(modifier = Modifier.width(10.dp))

                            Box(
                                modifier = Modifier
                                    .size(30.dp)
                                    .background(color = Color.Red, shape = CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("2", color = Color.White)
                            }

                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 5.dp, vertical = 15.dp),
                                text = "Linux Sticker | For Laptop Or Phone .... ",
                                color = Color.Black,
                                fontSize = 15.sp,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis,
                                textAlign = TextAlign.Start
                            )
                        }
                    }

                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(400.dp)
                            .padding(vertical = 10.dp, horizontal = 5.dp),
                        colors = CardDefaults.cardColors(Color.White),
                        elevation = CardDefaults.cardElevation(3.dp),
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.linux),
                                contentDescription = null,
                                modifier = Modifier
                                    .background(
                                        Color.LightGray,
                                        shape = RoundedCornerShape(
                                            topStart = 10.dp,
                                            bottomStart = 10.dp
                                        )
                                    )
                            )

                            Spacer(modifier = Modifier.width(10.dp))

                            Box(
                                modifier = Modifier
                                    .size(30.dp)
                                    .background(color = Color.Red, shape = CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("3", color = Color.White)
                            }

                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 5.dp, vertical = 15.dp),
                                text = "Linux Sticker | For Laptop Or Phone .... ",
                                color = Color.Black,
                                fontSize = 15.sp,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis,
                                textAlign = TextAlign.Start
                            )
                        }
                    }

                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        HorizontalDivider(
            modifier = Modifier
                .padding(vertical = 15.dp),
            thickness = 7.dp,
            color = Color(0x33C8C8C8)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 5.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Our suggestion",
                modifier = Modifier.padding(start = 10.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(5.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            for (item in populer) {

                Spacer(modifier = Modifier.width(8.dp))

                Box(
                    modifier = Modifier
                        .border(0.5.dp, Color.LightGray, shape = RoundedCornerShape(30.dp))
                        .background(Color.White, shape = RoundedCornerShape(30.dp))
                        .padding(horizontal = 10.dp, vertical = 5.dp)

                ) {
                    Text(item, modifier = Modifier.padding(5.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        for (i in 1..10) {
            Row {

                Card(
                    modifier = Modifier
                        .padding(5.dp)
                        .weight(0.5f),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(1.dp),
                ) {
                    Column(
                        modifier = Modifier
                            .padding(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Box(contentAlignment = Alignment.BottomEnd) {
                            Image(
                                painter = painterResource(R.drawable.linux),
                                null,
                                modifier = Modifier
                                    .padding(5.dp),
                            )
                            Box(
                                modifier = Modifier
                                    .border(
                                        0.5.dp,
                                        Color.LightGray,
                                        shape = RoundedCornerShape(10.dp)
                                    )
                                    .background(Color.White, shape = RoundedCornerShape(10.dp))

                            ) {
                                Row(
                                    modifier = Modifier
                                        .padding(horizontal = 5.dp, vertical = 2.dp),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "4.5",
                                        color = Color.Black,
                                        fontSize = 12.sp
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = null,
                                        tint = Color(0xFFFF9600),
                                        modifier = Modifier.size(13.dp)
                                    )
                                }
                            }
                        }

                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 5.dp, vertical = 15.dp),
                            text = "Linux Sticker | For Laptop Or Phone ....  ",
                            color = Color.Black,
                            fontSize = 15.sp,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                            textAlign = TextAlign.Start
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .background(
                                        color = Color.Red,
                                        shape = RoundedCornerShape(15.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "%68",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 2.dp)
                                )
                            }
                            Text(
                                "$300",
                                modifier = Modifier
                                    .padding(start = 5.dp),
                                color = Color.LightGray,
                                fontWeight = FontWeight.Bold,
                                textDecoration = TextDecoration.LineThrough
                            )
                        }

                        Text(
                            "$120",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 5.dp),
                            color = Color.Black,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                    }
                }

                Card(
                    modifier = Modifier
                        .padding(5.dp)
                        .weight(0.5f),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(1.dp),
                ) {
                    Column(
                        modifier = Modifier
                            .padding(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Box(contentAlignment = Alignment.BottomEnd) {
                            Image(
                                painter = painterResource(R.drawable.linux),
                                null,
                                modifier = Modifier
                                    .padding(5.dp),
                            )
                            Box(
                                modifier = Modifier
                                    .border(
                                        0.5.dp,
                                        Color.LightGray,
                                        shape = RoundedCornerShape(10.dp)
                                    )
                                    .background(Color.White, shape = RoundedCornerShape(10.dp))

                            ) {
                                Row(
                                    modifier = Modifier
                                        .padding(horizontal = 5.dp, vertical = 2.dp),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "4.5",
                                        color = Color.Black,
                                        fontSize = 12.sp
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = null,
                                        tint = Color(0xFFFF9600),
                                        modifier = Modifier.size(13.dp)
                                    )
                                }
                            }
                        }

                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 5.dp, vertical = 15.dp),
                            text = "Linux Sticker | For Laptop Or Phone ....  ",
                            color = Color.Black,
                            fontSize = 15.sp,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                            textAlign = TextAlign.Start
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .background(
                                        color = Color.Red,
                                        shape = RoundedCornerShape(15.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    "%68",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 2.dp)
                                )
                            }
                            Text(
                                "$300",
                                modifier = Modifier
                                    .padding(start = 5.dp),
                                color = Color.LightGray,
                                fontWeight = FontWeight.Bold,
                                textDecoration = TextDecoration.LineThrough
                            )
                        }

                        Text(
                            "$120",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 5.dp),
                            color = Color.Black,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                    }
                }

            }
        }
    }
}

@Composable
fun pagerIndicators(currentPage: Int, total: Int) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        repeat(total) {
            val color = if (it == currentPage) Color.Black else Color.LightGray
            val width = if (it == currentPage) 20 else 8
            val height = if (it == currentPage) 8 else 8
            Box(
                modifier = Modifier
                    .padding(horizontal = 4.dp, vertical = .10.dp)
                    .size(width = width.dp, height = height.dp)
                    .background(color, shape = CircleShape)
            )
        }
    }
}

@Composable
fun cardListHorizontal(title: String, pic: Int) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 5.dp)
    ) {
        Text(title, fontSize = 20.sp, fontWeight = FontWeight.Bold)
    }

    Row(
        modifier = Modifier
            .padding(start = 5.dp)
            .horizontalScroll(rememberScrollState())
    ) {
        for (i in 1..10) {
            Card(
                modifier = Modifier
                    .padding(5.dp)
                    .width(170.dp),
                colors = CardDefaults.cardColors(Color.White),
                elevation = CardDefaults.cardElevation(1.dp),
            ) {
                Column(
                    modifier = Modifier
                        .padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Box(contentAlignment = Alignment.BottomEnd) {
                        Image(
                            painter = painterResource(pic),
                            null,
                            modifier = Modifier
                                .padding(5.dp),
                        )
                        Box(
                            modifier = Modifier
                                .border(0.5.dp, Color.LightGray, shape = RoundedCornerShape(10.dp))
                                .background(Color.White, shape = RoundedCornerShape(10.dp))

                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(horizontal = 5.dp, vertical = 2.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "4.5",
                                    color = Color.Black,
                                    fontSize = 12.sp
                                )
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = null,
                                    tint = Color(0xFFFF9600),
                                    modifier = Modifier.size(13.dp)
                                )
                            }
                        }
                    }

                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 5.dp, vertical = 15.dp),
                        text = "Linux Sticker | For Laptop Or Phone ....  ",
                        color = Color.Black,
                        fontSize = 15.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Start
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .background(
                                    color = Color.Red,
                                    shape = RoundedCornerShape(15.dp)
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "%68",
                                color = Color.White,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(horizontal = 2.dp)
                            )
                        }
                        Text(
                            "$300",
                            modifier = Modifier
                                .padding(start = 5.dp),
                            color = Color.LightGray,
                            fontWeight = FontWeight.Bold,
                            textDecoration = TextDecoration.LineThrough
                        )
                    }

                    Text(
                        "$120",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 5.dp),
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )
                }
            }
        }
    }

}